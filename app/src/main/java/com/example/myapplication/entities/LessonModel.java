package com.example.myapplication.entities;

import androidx.annotation.NonNull;

import java.util.Date;

import lombok.Data;

@Data
public class LessonModel implements Cloneable {
    private String category;
    private String displayName;
    private String instructor;
    private Date start;
    private String description;

    public String getDisplayName() {
        return displayName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NonNull
    @Override
    public LessonModel clone() {
        try {
            LessonModel clone = (LessonModel) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
