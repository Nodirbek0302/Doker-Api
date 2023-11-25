package com.example.dockerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salom")
public class SalomController {

    @GetMapping
    public String get(@RequestParam(required = false) String name){
        return "salom controller "+(name!=null?name:"");
    }
}
