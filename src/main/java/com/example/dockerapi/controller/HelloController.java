package com.example.dockerapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nima")
public class HelloController {

    @GetMapping
    public String get(@RequestParam(required = false) String name){
        return "nima "+(name!=null?name:"");
    }
}
