package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by jakerman on 13/02/2017.
 */
@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

    @PersistenceContext
    EntityManager entityManager;


    public Exercise save(Exercise exercise) {
        entityManager.persist(exercise);

        entityManager.flush();

        return exercise;
    }

}
