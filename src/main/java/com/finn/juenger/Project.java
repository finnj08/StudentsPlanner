package com.finn.juenger;

import java.time.LocalDate;
import java.time.Year;

public class Project {
    protected LocalDate deadline;
    protected Subject subject;
    protected String title;
    protected double expense;
    protected int id;
    protected String description;
    protected int priority;

    public Project(int id, String title, LocalDate deadline, Subject subject, int expense, String description,  int priority) {
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.subject = subject;
        this.expense = expense;
        this.description = description;
        this.priority = priority;
    }

    public Project(int id, String title, Subject subject) {
        this.id = id;
        this.title = title;
        this.subject = subject;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDeadline() {
        return this.deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Subject getSubject() {
        return this.subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getExpense() {
        return this.expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getRemainingDays() {
        LocalDate now = LocalDate.now();
        int remainingDays = 0;
        if (now.getYear() == this.deadline.getYear()) {
            return this.deadline.getDayOfYear() - now.getDayOfYear();
        } else {
            int yearCounter = now.getYear();
            if (now.isBefore(this.deadline)) {
                remainingDays+=(Year.of(yearCounter).length() - now.getDayOfYear());
                yearCounter++;
                while (yearCounter != this.deadline.getYear()) {
                    remainingDays+=Year.of(yearCounter).length();
                    yearCounter++;
                }
                remainingDays+=this.deadline.getDayOfYear();
            } else {
                remainingDays-=now.getDayOfYear();
                yearCounter--;
                while (yearCounter != this.deadline.getYear()) {
                    remainingDays-=Year.of(yearCounter).length();
                    yearCounter--;
                }
                remainingDays-=(Year.of(yearCounter).length() - this.deadline.getDayOfYear());
            }
            return remainingDays;
        }
    }
}
