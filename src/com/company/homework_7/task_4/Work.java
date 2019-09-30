package com.company.homework_7.task_4;

import java.io.Serializable;

public class Work implements Serializable {
    private String title;
    private int experience;

    public Work(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
