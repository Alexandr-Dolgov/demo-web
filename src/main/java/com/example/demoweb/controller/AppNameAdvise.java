package com.example.demoweb.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class AppNameAdvise {

    @ModelAttribute("appName")
    public String appName() {
        return "Look at this!";
    }
}
