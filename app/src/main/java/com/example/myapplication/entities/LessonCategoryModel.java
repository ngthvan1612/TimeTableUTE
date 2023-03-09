package com.example.myapplication.entities;

import androidx.annotation.NonNull;

public class LessonCategoryModel implements Cloneable {
    private Integer id;
    private String name;
    private Integer resourceIcon;

    public LessonCategoryModel() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getResourceIcon() {
        return resourceIcon;
    }

    public void setResourceIcon(Integer resourceIcon) {
        this.resourceIcon = resourceIcon;
    }

    @NonNull
    @Override
    public LessonCategoryModel clone() {
        try {
            LessonCategoryModel clone = (LessonCategoryModel) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
