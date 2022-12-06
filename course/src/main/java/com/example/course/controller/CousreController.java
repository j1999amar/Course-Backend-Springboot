package com.example.course.controller;

import com.example.course.dao.CourseDao;
import com.example.course.model.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class CousreController {
    @Autowired
    private CourseDao courseDao;
    @PostMapping(path = "/addCourse",produces = "application/json",consumes = "application/json")
    public String AddCourse(@RequestBody CourseModel courseModel){
        System.out.println(
                "Course Title "+courseModel.getCourseTitle()+"\n"+
                "Course Description "+courseModel.getCourseDescription()+"\n"+
                "Course Venue "+courseModel.getCourseVenue()+"\n"+
                "Course Duration "+courseModel.getCourseDuration()+"\n"+
                "Course Date "+courseModel.getCourseDate()+"\n"
        );
        courseDao.save(courseModel);
        return "Add Course";
    }
    @GetMapping("/viewAllCourse")
    public String ViewAllCourse(){
        return "View All Course";
    }



}
