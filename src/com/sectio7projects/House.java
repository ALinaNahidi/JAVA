package com.sectio7projects;

public class House {
    private String color;
    private int numStories;
    private int numWindows;

    public House(String color, int numStories, int numWindows) {
        this.color = color;
        this.numStories = numStories;
        this.numWindows = numWindows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumStories() {
        return numStories;
    }

    public void setNumStories(int numStories) {
        this.numStories = numStories;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }
}

