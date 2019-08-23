package com.example.demoweb.controller;

import com.example.demoweb.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsViewController {

    @Autowired
    PostsService postsService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("appName", "Look at this!");
        model.addAttribute("list", postsService.listAllPosts());
        return "list";
    }

    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("list",
                postsService.listAllPosts().subList(id, id + 1));
        return "list";
    }

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
