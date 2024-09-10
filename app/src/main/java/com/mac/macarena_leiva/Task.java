package com.mac.macarena_leiva;

public class Task {
    private String name;
    private String priority;
    private int progress;
    private float importance;

    public Task(String name, String priority, int progress, float importance) {
        this.name = name;
        this.priority = priority;
        this.progress = progress;
        this.importance = importance;
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public int getProgress() {
        return progress;
    }

    public float getImportance() {
        return importance;
    }
}
