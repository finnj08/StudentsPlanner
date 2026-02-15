package com.finn.juenger;

import java.time.LocalDate;
import java.time.Year;

public class Homework extends Project {

    public boolean status;

    public Homework(int id, String title, LocalDate deadline, Subject subject, int expense, String description, int priority) {
        super(id, title, deadline, subject, expense, description, priority);
    }

    public boolean getStatus() {
        return this.status;
    }

    public void switchStatus(boolean status) {
        this.status = status;
    }
}
