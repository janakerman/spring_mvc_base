package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "goals")
// Instead of having JPQL in our repositories, we can tie these queries to the domain object like so, and access them
// Not sure if I like this, as it's tying JPA specific logic to our model object - have a think?
@NamedQueries({
        @NamedQuery(name=Goal.FIND_GOAL_REPORTS, query="Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) " +
                "from Goal g, Exercise e where g.id = e.goal.id"),
        @NamedQuery(name=Goal.FIND_ALL_GOALS, query="Select g from Goal g")
})
public class Goal {

    public static final String FIND_GOAL_REPORTS = "findGoalReports";
    public static final String FIND_ALL_GOALS = "findAllGoals";

    @Id
    @GeneratedValue // We are using the column type of the database - in MySQL we'll use an auto-incrementing field.
    @Column(name = "GOAL_ID") // We can specify a name if we want our column name to be different to the field name
    private Long id;

    @Range(min = 1, max = 120)
    @Column(name = "MINUTES") // Same as above RE specifying name - just an exercise for demonstration.
    private int minutes;

    @OneToMany(mappedBy = "goal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Exercise> exercises = new ArrayList<Exercise>();

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

}
