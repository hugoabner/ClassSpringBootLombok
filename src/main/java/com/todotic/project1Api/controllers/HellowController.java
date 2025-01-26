package com.todotic.project1Api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HellowController {

    @GetMapping("/app/food")
    public Map<String, Object> food() {
        Map<String, Object> json = new HashMap<>();
        json.put("message", "Hola mundo spring boot api rest");
        json.put("Date", new Date());
        return json;
    }
}
