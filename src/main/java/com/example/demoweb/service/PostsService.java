package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();

        posts.add(new Post(0L, "Первый пост в списке", 0));
        posts.add(new Post(1L, "Второй пост в списке", 0));
        posts.add(new Post(2L, "Третий пост в списке", 0));

        return posts;
    }

}
