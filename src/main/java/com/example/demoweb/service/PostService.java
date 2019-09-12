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
        posts.add(new Post(0L,"пост 1", new Date()));
        posts.add(new Post(1L,"пост 2", new Date()));
        posts.add(new Post(2L,"пост 3", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        long newId = posts.size();
        posts.add(new Post(newId, text, new Date()));
    }

}
