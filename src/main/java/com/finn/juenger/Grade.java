package com.finn.juenger;

public class Grade {
    private Subject subject;
    private int id;
    private double standardValue;
    private int abiturValue;
    private String type;
    private String description;

    public Grade( Subject subject, int id, double standardValue, String type, String description) {
        this.subject = subject;
        this.id = id;
        this.standardValue = standardValue;
        this.type = type;
        this.description = description;
    }

    public Grade (Subject subject, int id, int abiturValue, String type, String description) {
        this.subject = subject;
        this.id = id;
        this.abiturValue = abiturValue;
        this.type = type;
        this.description = description;
    }

    public Grade (Subject subject, int id, double standardValue) {
        this.subject = subject;
        this.id = id;
        this.standardValue = standardValue;
    }

    public Grade (Subject subject, int id, int abiturValue) {
        this.subject = subject;
        this.id = id;
        this.abiturValue = abiturValue;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getStandardValue() {
        return standardValue;
    }

    public void setStandardValue(double standardValue) {
        this.standardValue = standardValue;
    }

    public int getAbiturValue() {
        return abiturValue;
    }

    public void setAbiturValue(int abiturValue) {
        this.abiturValue = abiturValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
