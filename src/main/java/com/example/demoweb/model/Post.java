package com.example.demoweb.model;

public class Post {

    Long id;
    String text;
    Integer likes;

    public Post(Long id, String text, Integer likes) {
        this.id = id;
        this.text = text;
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
