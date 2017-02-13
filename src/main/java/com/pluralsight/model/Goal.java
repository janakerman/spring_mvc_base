package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "goals")
public class Goal {

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
