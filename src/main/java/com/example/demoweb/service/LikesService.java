package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {

    @Autowired
    PostsService postsService;

    public Integer like(Long id) {
        Post post = postsService.listAllPosts().get(id.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }

}
