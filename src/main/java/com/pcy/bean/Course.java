package com.pcy.bean;


public class Course {

    private String name;
    private int score;
    private double credit;

    public Course() {
    }

    public Course(String name, int score, double credit) {
        this.name = name;
        this.score = score;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", credit=" + credit +
                '}';
    }
}
