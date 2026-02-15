package com.finn.juenger;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Exam extends Project {
    private ArrayList<String> topics;
    private double preparedLvl;
    private Grade grade;
    private boolean written;

    public Exam (int id, String title, LocalDate deadline, Subject subject, int expense, String description, int priority) {
        super(id, title, deadline, subject, expense, description, priority);
    }

    public Exam (int id, String title, Subject subject) {
        super(id, title, subject);
    }

    public  ArrayList<String> getTopics() {
        return this.topics;
    }

    public void setTopics(ArrayList<String> topics) {
        this.topics = topics;
    }

    public void addTopic(String topic) {
        this.topics.add(topic);
    }

    public double getPreparedLvl() {
        return this.preparedLvl;
    }

    public void setPreparedLvl(double preparedLvl) {
        this.preparedLvl = preparedLvl;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean isWritten() {
        return this.written;
    }

    public void setWritten(boolean written) {
        this.written = written;
    }
}
