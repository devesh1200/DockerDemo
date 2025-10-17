package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class Controller {
    @GetMapping("/add")
    public  String hello(){
        return " Cloud Testing Code  ";
    }
}
