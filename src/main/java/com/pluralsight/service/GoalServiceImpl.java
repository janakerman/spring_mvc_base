package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jakerman on 13/02/2017.
 */
@Service("goalService")
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepository goalRepository;

    @Transactional // Provided by spring - otherwise we'd have to do this in code, start, rollback on exception etc.
    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    public List<Goal> findAllGoals() {
        return goalRepository.findAllGoals();
    }


}
