package com.finn.juenger;

import java.time.LocalDate;

public class Homework {
    private String id;
    private String title;
    private LocalDate deadline;
    private Subject subject;
    private int expense;
    private String description;
    public boolean status;
    private int priority;

    public Homework(String id, String title, LocalDate deadline, Subject subject, int expense, String description,  int priority) {
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.subject = subject;
        this.expense = expense;
        this.description = description;
        this.status = false;
        this.priority = priority;
    }

    public Homework (String id) {
        this.id = id;
    }
    public Homework (String id, LocalDate deadline) {
        this.id = id;
        this.deadline = deadline;
    }

    public String getId() {
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

    public boolean getStatus() {
        return this.status;
    }

    public void switchStatus(boolean status) {
        this.status = status;
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
            int yearDiff = this.deadline.getYear() - now.getYear();
            if (yearDiff > 0) {
                for (int i = 0; i < yearDiff; i++) {
                    remainingDays += 365;
                }
                remainingDays-=now.getDayOfYear() - this.deadline.getDayOfYear();
            } else {
                for (int i = 0; i > yearDiff; i--) {
                    remainingDays -= 365;
                }
                remainingDays+=now.getDayOfYear() - this.deadline.getDayOfYear();
            }
            return remainingDays;
        }
    }
}
