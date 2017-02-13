package com.pluralsight.service;

import com.pluralsight.model.Goal;

import java.util.List;

/**
 * Created by jakerman on 13/02/2017.
 */
public interface GoalService {

    Goal save(Goal goal);

    List<Goal> findAllGoals();
}
