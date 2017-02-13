package com.pluralsight.model;

/**
 * Created by jakerman on 13/02/2017.
 */
// View object - not an entity - has nothing to do with our persistence tier - just display logic.
public class GoalReport {

    private int goalMinutes;
    private int exerciseMinutes;
    private String exerciseActivity;

    // Constructor has been built here for JPA PROJECTION
    public GoalReport(int goalMinutes, int exerciseMinutes, String exerciseActivity) {
        this.goalMinutes = goalMinutes;
        this.exerciseMinutes = exerciseMinutes;
        this.exerciseActivity = exerciseActivity;
    }

    public int getGoalMinutes() {
        return goalMinutes;
    }

    public void setGoalMinutes(int goalMinutes) {
        this.goalMinutes = goalMinutes;
    }

    public int getExerciseMinutes() {
        return exerciseMinutes;
    }

    public void setExerciseMinutes(int exerciseMinutes) {
        this.exerciseMinutes = exerciseMinutes;
    }

    public String getExerciseActivity() {
        return exerciseActivity;
    }

    public void setExerciseActivity(String exerciseActivity) {
        this.exerciseActivity = exerciseActivity;
    }
}
