package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Models.Student;
import com.example.myapplication.R;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>{
    List<Student> students;
    Context context;

    public StudentAdapter(List<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View currentView = LayoutInflater.from(context).inflate(R.layout.student_item_card,null,true);
        return new StudentViewHolder(currentView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = students.get(position);

        if(student.getName() !=null){
            holder.studentName.setText(student.getName());
        }
        if(student.getPhone() != null){
            holder.studentPhone.setText(student.getPhone());
        }
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView studentName,studentPhone;
        CardView cardView;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewStudent);
            studentName=itemView.findViewById(R.id.txtStudentName);
            studentPhone=itemView.findViewById(R.id.txtStudentPhone);
            cardView=itemView.findViewById(R.id.studentItem);
        }
    }
}