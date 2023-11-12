package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Models.Category;
import com.example.myapplication.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CagtegoryViewHolder> {
    private List<Category> categoryList;
    private Context context;
    public CategoryAdapter(List<Category> categoryList,Context context)
        {
            this.categoryList=categoryList;
            this.context=context;
        }

    @NonNull
    @Override
    public CagtegoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.category_item_card_layout,null,false);
        return new CagtegoryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CagtegoryViewHolder holder, int position) {
        Category category = categoryList.get(position);
        if (category.getName()!=null){
            holder.name.setText(category.getName());
        }
        if (category.getArticles()!=null){
            ArticleAdapter articleAdapter = new ArticleAdapter(category.getArticles(),context);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context,1,RecyclerView.HORIZONTAL,false);
            holder.recyclerViewArticle.setLayoutManager(gridLayoutManager);
            holder.recyclerViewArticle.setAdapter(articleAdapter);
        }
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static class CagtegoryViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        RecyclerView recyclerViewArticle;
            public CagtegoryViewHolder(@NonNull View itemView){
                super(itemView);
                name = itemView.findViewById((R.id.txtCategoryName));
                recyclerViewArticle = itemView.findViewById(R.id.recyclerArticle);
            }
        }
}
