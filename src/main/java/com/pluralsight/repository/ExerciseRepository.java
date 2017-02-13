package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jakerman on 13/02/2017.
 */
@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {}
