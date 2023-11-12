package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Models.Student;
import com.example.myapplication.adapters.StudentAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewStudent;
    private StudentAdapter studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView(){
        recyclerViewStudent = findViewById(R.id.recyclerViewStudent);
        getData();
    }

    public void getData(){
        // student list data
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Heng Somnang","098521122"));

        Student dara = new Student();
        dara.setName("test");
        dara.setPhone("09837362");
        studentList.add(dara);

        studentAdapter = new StudentAdapter(studentList,this);

        // layout manager
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1);
        recyclerViewStudent.setLayoutManager(gridLayoutManager);
        // set layout
        recyclerViewStudent.setAdapter(studentAdapter);
    }
}