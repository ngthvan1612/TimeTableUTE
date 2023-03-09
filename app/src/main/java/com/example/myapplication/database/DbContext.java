package com.example.myapplication.database;

import com.example.myapplication.database.testing.TestingLessonRepositoryImpl;

import lombok.Data;

public class DbContext {
    private LessonRepository lessonRepository;

    public DbContext() {
        this.setLessonRepository(new TestingLessonRepositoryImpl());
    }

    public LessonRepository getLessonRepository() {
        return lessonRepository;
    }

    public void setLessonRepository(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }
}
