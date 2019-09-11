package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    {
        posts = new ArrayList<>();
        posts.add(new Post("пост 1", new Date()));
        posts.add(new Post("пост 2", new Date()));
        posts.add(new Post("пост 3", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

}
