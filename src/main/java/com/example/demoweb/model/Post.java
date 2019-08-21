package com.example.demoweb.model;

public class Post {

    String text;
    Integer likes;

    public Post(String text) {
        this.text = text;
        this.likes = 0;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
