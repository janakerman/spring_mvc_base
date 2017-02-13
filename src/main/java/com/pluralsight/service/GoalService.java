package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

import java.util.List;

/**
 * Created by jakerman on 13/02/2017.
 */
public interface GoalService {

    Goal save(Goal goal);

    List<Goal> findAllGoals();

    List<GoalReport> findAllGoalReports();
}
