package com.example.myapplication.database;

import com.example.myapplication.entities.LessonModel;

import java.util.List;

public interface LessonRepository {
    List<LessonModel> getAllLessons();
}
