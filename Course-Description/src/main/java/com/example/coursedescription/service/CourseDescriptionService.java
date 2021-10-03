package com.example.coursedescription.service;

import com.example.coursedescription.module.Courses;

import java.util.List;

public interface CourseDescriptionService {
    List<Courses> getAllCourses();
    Courses getCourseById(Long id);
}
