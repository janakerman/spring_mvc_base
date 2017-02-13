package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
        TypedQuery<Goal> query = entityManager.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
        return query.getResultList();
    }

    public List<GoalReport> findAllGoalReports() {
        TypedQuery<GoalReport> query = entityManager.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
        return query.getResultList();
    }
}
