package com.example.demoweb.model;

public class Post {

    private String text;
    private int likes;

    public Post(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }
}
