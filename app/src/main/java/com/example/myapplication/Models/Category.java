package com.example.myapplication.Models;

import java.util.List;

public class Category {
    private int id;

    public Category(String name, List<Article> articles) {
        this.name = name;
        this.articles = articles;
    }

    private String name;
    private List<Article> articles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
