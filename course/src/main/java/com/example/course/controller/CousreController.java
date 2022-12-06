package com.example.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class CousreController {
    @PostMapping(path = "/addCourse",produces = "application/json",consumes = "application/json")
    public String AddCourse(){
        return "Add Course";
    }
    @GetMapping("/viewAllCourse")
    public String ViewAllCourse(){
        return "View All Course";
    }



}
