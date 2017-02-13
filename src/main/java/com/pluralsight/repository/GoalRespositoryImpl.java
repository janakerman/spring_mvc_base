package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}
