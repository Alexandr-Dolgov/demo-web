package com.example.demoweb.controller;

import com.example.demoweb.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsViewController {

    @Autowired
    PostsService postsService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("list", postsService.listAllPosts());
        return "list";
    }

    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id, Model model) {
        model.addAttribute("list", postsService.filterById(id));
        return "list";
    }

}
