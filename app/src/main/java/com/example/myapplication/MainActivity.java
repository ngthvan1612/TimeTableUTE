package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.adapter.ListLessonInADayAdapter;

public class MainActivity extends AppCompatActivity {
    private final ListLessonInADayAdapter listLessonInADayAdapter;

    public MainActivity() {
        super();
        this.listLessonInADayAdapter = new ListLessonInADayAdapter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ListView listLessonInADay = findViewById(R.id.listViewLessonOneDay);
        listLessonInADay.setAdapter(this.listLessonInADayAdapter);
    }
}