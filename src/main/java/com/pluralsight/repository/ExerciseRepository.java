package com.pluralsight.repository;

import com.pluralsight.model.Exercise;

/**
 * Created by jakerman on 13/02/2017.
 */
public interface ExerciseRepository {
    Exercise save(Exercise exercise);
}
