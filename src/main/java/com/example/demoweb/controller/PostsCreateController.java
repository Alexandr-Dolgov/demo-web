package com.example.demoweb.controller;

import com.example.demoweb.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsCreateController {

    @Autowired
    PostsService postsService;

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create() {
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        Long id = postsService.create(text);
        return "redirect:/post/" + id;
    }
}
