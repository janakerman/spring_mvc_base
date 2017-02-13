package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

import java.util.List;

/**
 * Created by jakerman on 13/02/2017.
 */
public interface GoalRepository {

    Goal save(Goal goal);

    List<Goal> findAllGoals();

    List<GoalReport> findAllGoalReports();
}
