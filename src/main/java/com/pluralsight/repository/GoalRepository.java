package com.pluralsight.repository;

import com.pluralsight.model.Goal;

/**
 * Created by jakerman on 13/02/2017.
 */
public interface GoalRepository {

    Goal save(Goal goal);

}
