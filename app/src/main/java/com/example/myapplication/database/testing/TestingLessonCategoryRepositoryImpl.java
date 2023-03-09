package com.example.myapplication.database.testing;

import com.example.myapplication.database.LessonCategoryRepository;
import com.example.myapplication.entities.LessonCategoryModel;

import java.util.ArrayList;
import java.util.List;

public class TestingLessonCategoryRepositoryImpl implements LessonCategoryRepository {

    private final List<LessonCategoryModel> lessonCategoryRepositoryList;

    public TestingLessonCategoryRepositoryImpl() {
        this.lessonCategoryRepositoryList = new ArrayList<>();

        //
    }

    private void buildLessonCategoryModelList() {
        LessonCategoryModel category1 = new LessonCategoryModel();
        category1.setId(1);
        category1.setName("Môn bắc buộc");
        //TODO: nhớ set cái image

        LessonCategoryModel category2 = new LessonCategoryModel();
        category1.setId(1);
        category1.setName("Môn bắc buộc");

        this.lessonCategoryRepositoryList.add(category1);
        this.lessonCategoryRepositoryList.add(category2);
    }

    @Override
    public LessonCategoryModel getLessonCategoryModelById(Integer id) {
        return null;
    }
}
