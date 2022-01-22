package com.example.firstproject.dto;

public class ArticleForm {
    public ArticleForm(String title, String content) {
        this.content = content;
        this.title = title;
    }

    private String title;
    private String content;

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
