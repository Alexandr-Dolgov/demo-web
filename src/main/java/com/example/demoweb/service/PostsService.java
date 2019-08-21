package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();

        posts.add(new Post("Первый пост в списке"));
        posts.add(new Post("Второй пост в списке"));
        posts.add(new Post("Третий пост в списке"));

        return posts;
    }

}
