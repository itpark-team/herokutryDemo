package com.example.herokutry.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/home", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class HomeController {
    @GetMapping(value = "/hello")
    public String hello() throws Exception {
        return "hello world";
    }
}
