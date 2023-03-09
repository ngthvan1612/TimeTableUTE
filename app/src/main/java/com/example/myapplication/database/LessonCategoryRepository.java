package com.example.myapplication.database;

import com.example.myapplication.entities.LessonCategoryModel;

public interface LessonCategoryRepository {
    LessonCategoryModel getLessonCategoryModelById(Integer id);
}
