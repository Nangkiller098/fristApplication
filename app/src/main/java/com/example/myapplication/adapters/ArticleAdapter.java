package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Models.Article;
import com.example.myapplication.R;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> {
    public ArticleAdapter(List<Article> articleList, Context context) {
        this.articleList = articleList;
        this.context = context;
    }

    private List<Article> articleList;
    private Context context;

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View currentView = LayoutInflater.from(context).inflate(R.layout.article_item_card_layout,null);
        return new ArticleViewHolder(currentView);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int i ) {
    Article article = articleList.get(i);
        if (article.getTitle()!=null){
            holder.title.setText(article.getTitle());
        }
        if (article.getDescription()!=null) {
            holder.desc.setText(article.getDescription());
        }
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public static class ArticleViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView title,desc,date;
        public ArticleViewHolder(@NonNull View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.imageViewArticle);
            title = itemView.findViewById(R.id.txtArticleTitle);
            desc = itemView.findViewById(R.id.txtArticleDesc);
            date =itemView.findViewById(R.id.txtDate);

        }
    }
}
