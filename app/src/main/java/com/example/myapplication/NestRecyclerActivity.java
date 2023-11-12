package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Models.Article;
import com.example.myapplication.Models.Category;
import com.example.myapplication.adapters.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class NestRecyclerActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCategory;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nest_recycler);
        initView();
    }
    private void  initView(){
        recyclerViewCategory= findViewById(R.id.recyclerViewCategory);
        getData();
    }
    private void getData(){
        List<Category> categories = new ArrayList<>();
        String[] art ={"News","Sports","TovSrok","Movie"};
        for (String i : art)
        {
            List<Article> article = new ArrayList<>();
            for (int j=1;j<=5;j++){
                article.add(new Article("Article: "+i+ j,"Description: "+i+j));
            }
            Category news = new Category(i,article);
            categories.add(news);
        }
        categoryAdapter = new CategoryAdapter(categories,this);

        GridLayoutManager gridLayoutManager= new GridLayoutManager(this,1);

        recyclerViewCategory.setLayoutManager(gridLayoutManager);
        recyclerViewCategory.setAdapter(categoryAdapter);
    }
}