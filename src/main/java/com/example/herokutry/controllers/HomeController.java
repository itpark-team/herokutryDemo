package com.example.herokutry.controllers;

import com.example.herokutry.models.entities.PStar;
import com.example.herokutry.models.tables.TablePStars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/home", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class HomeController {

    @Autowired
    private final TablePStars tablePStars;

    public HomeController(TablePStars tablePStars) {
        this.tablePStars = tablePStars;
    }

    @GetMapping(value = "/hello")
    public String hello() throws Exception {
        return "hello world";
    }

    @GetMapping(value = "/getGirls")
    public List<PStar> getGirls() throws Exception {
        return tablePStars.findAll();
    }

}
