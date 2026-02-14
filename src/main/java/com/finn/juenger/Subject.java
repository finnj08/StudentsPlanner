package com.finn.juenger;

import java.awt.*;

public class Subject {
    private String name;
    private String shortForm;
    private Color color;

    public Subject(String name, String shortForm, Color color) {
        this.name = name;
        this.shortForm = shortForm;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortForm() {
        return this.shortForm;
    }

    public void setShortForm(String shortForm) {
        this.shortForm = shortForm;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
