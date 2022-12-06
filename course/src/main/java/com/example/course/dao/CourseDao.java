package com.example.course.dao;

import com.example.course.model.CourseModel;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<CourseModel,Integer> {
}
