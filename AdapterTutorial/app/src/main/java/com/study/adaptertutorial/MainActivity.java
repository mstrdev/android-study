package com.study.adaptertutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students.add(new Student("Max", 18));
        students.add(new Student("Mark", 28));
        students.add(new Student("Thomas", 29));
        students.add(new Student("Wilson", 22));
        students.add(new Student("Colin", 18));
        students.add(new Student("Frank", 28));
        students.add(new Student("Robert", 29));
        students.add(new Student("Clifford", 22));

        students.add(new Student("Daniel", 18));
        students.add(new Student("Bridget", 28));
        students.add(new Student("Louis", 29));
        students.add(new Student("Carl", 22));
        students.add(new Student("Beatrice", 18));
        students.add(new Student("Ricardo", 28));
        students.add(new Student("Sophie", 29));
        students.add(new Student("Ervin", 22));

        students.add(new Student("Neil", 18));
        students.add(new Student("Sharon", 28));
        students.add(new Student("Dwayne", 29));
        students.add(new Student("Lynette", 22));
        students.add(new Student("Mercedes", 18));
        students.add(new Student("Ida", 28));
        students.add(new Student("Edna", 29));
        students.add(new Student("Elias", 22));

        ListView studentList = (ListView) findViewById(R.id.student_list);
        final StudentAdapter adapter = new StudentAdapter(this, students);
        studentList.setAdapter(adapter);
        studentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                final Student item = (Student) parent.getItemAtPosition(position);
                item.age=item.age+1;
                adapter.notifyDataSetChanged();




            }
        });

    }
}
