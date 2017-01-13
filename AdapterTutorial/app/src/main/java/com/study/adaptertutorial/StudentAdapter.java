package com.study.adaptertutorial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by bogdanov on 11.01.17.
 */

public class StudentAdapter extends ArrayAdapter<Student> {


    public StudentAdapter(Context context, List<Student> students) {
        super(context, android.R.layout.two_line_list_item, students);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(android.R.layout.two_line_list_item, null);
        }

        Student student = getItem(position);

        if (student == null)
            return convertView;
        ((TextView) convertView.findViewById(android.R.id.text1))
                .setText(student.getName());
        ((TextView) convertView.findViewById(android.R.id.text2))
                .setText(String.valueOf(student.getAge()));
        return convertView;
    }
}
