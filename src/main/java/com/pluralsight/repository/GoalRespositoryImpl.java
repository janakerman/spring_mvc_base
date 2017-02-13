package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by jakerman on 13/02/2017.
 */
@Repository("GoalRepository")
public class GoalRespositoryImpl implements GoalRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Goal save(Goal goal) {
        entityManager.persist(goal);

        // You have to flush before changes are actually written to database
        // Otherwise it won't save until you do a READ
        entityManager.flush();

        return goal;
    }

    public List<Goal> findAllGoals() {
        Query query = entityManager.createQuery("Select g from Goal g");
        return query.getResultList();
    }

    public List<GoalReport> findAllGoalReports() {
        Query query = entityManager.createQuery("Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) " +
                                                "from Goal g, Exercise e where g.id = e.goal.id");
        return query.getResultList();
    }
}
