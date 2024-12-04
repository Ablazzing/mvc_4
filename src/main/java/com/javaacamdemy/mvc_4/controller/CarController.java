package com.javaacamdemy.mvc_4.controller;

import com.javaacamdemy.mvc_4.Color;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/car")
    public void getCar(@RequestParam Color color) {
        System.out.println("___________________________________________");
        System.out.println(color);
        System.out.println("___________________________________________");
    }
}
