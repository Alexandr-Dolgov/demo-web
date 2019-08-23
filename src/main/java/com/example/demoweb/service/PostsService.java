package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class PostsService {

    @Autowired
    PostRepository postRepository;

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public Iterable<Post> filterById(Long id) {
        return postRepository.findAllById(Collections.singletonList(id));
    }

    public Long create(String text) {
        Post post = new Post(null, text, 0);
        post = postRepository.save(post);
        return post.getId();
    }
}
