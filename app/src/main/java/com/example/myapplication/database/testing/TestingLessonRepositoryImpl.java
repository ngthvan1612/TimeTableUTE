package com.example.myapplication.database.testing;

import com.example.myapplication.database.LessonRepository;
import com.example.myapplication.entities.LessonModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestingLessonRepositoryImpl implements LessonRepository {
    private final List<LessonModel> listLessons;

    public TestingLessonRepositoryImpl() {
        this.listLessons = new ArrayList<>();

        //
        this.buildListLessons();
    }

    private void buildListLessons() {
        //1
        LessonModel lessonModel1 = new LessonModel();
        lessonModel1.setDisplayName("Lập trình hướng đối tượng");
        lessonModel1.setInstructor("Nguyễn Minh Đạo");
        lessonModel1.setDescription("Chiều thứ 2 tiết 8-9");

        //2
        LessonModel lessonModel2 = new LessonModel();
        lessonModel2.setDisplayName("Công nghệ phần mềm hướng đối tượng");
        lessonModel2.setInstructor("Hoàng Công Trình");
        lessonModel2.setDescription("Sáng thứ 4 tiết 1-4");

        //3
        LessonModel lessonModel3 = new LessonModel();
        lessonModel3.setDisplayName("Lập trình web");
        lessonModel3.setInstructor("Trương Thị Khánh Dịp");
        lessonModel3.setDescription("Sáng thứ 7 tiết 1-4");

        //add
        this.listLessons.add(lessonModel1);
        this.listLessons.add(lessonModel2);
        this.listLessons.add(lessonModel3);
    }

    @Override
    public List<LessonModel> getAllLessons() {
        return this.listLessons.stream().map(LessonModel::clone).collect(Collectors.toList());
    }
}
