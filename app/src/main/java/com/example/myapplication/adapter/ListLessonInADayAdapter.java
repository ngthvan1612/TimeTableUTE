package com.example.myapplication.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.database.DbContext;
import com.example.myapplication.database.DbContextSingleton;
import com.example.myapplication.database.LessonRepository;
import com.example.myapplication.entities.LessonModel;

import java.util.List;

public class ListLessonInADayAdapter extends BaseAdapter {
    private static final DbContext dbContext = DbContextSingleton.getInstance();
    private static final LessonRepository lessonRepository = dbContext.getLessonRepository();


    private Activity activity;

    private List<LessonModel> listLessons;

    public ListLessonInADayAdapter(Activity activity) {
        this.activity = activity;
        this.listLessons = lessonRepository.getAllLessons();
    }

    @Override
    public int getCount() {
        return this.listLessons.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listLessons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        LessonModel lessonModel = this.listLessons.get(position);

        view = inflater.inflate(R.layout.timeline_row_view, null);

        ((TextView)view.findViewById(R.id.textViewCategory)).setText(lessonModel.getCategory());
        ((TextView)view.findViewById(R.id.textViewLessonName)).setText(lessonModel.getDisplayName());
        ((TextView)view.findViewById(R.id.textViewDescription)).setText(lessonModel.getDescription());

        return view;
    }
}
