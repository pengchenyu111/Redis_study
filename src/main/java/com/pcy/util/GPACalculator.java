package com.pcy.util;

import com.pcy.bean.Course;

import java.util.List;

public class GPACalculator {

    public static double calculate(List<Course> courses){

        double myScore = 0;
        double totalScore = 0;

        for (Course course : courses) {
            myScore += course.getScore() * course.getCredit();
            totalScore += 100* course.getCredit();
        }

        double result = myScore/totalScore * 100.0;
        return result;
    }
}
