package com.example.coursedescription.service.impl;

import com.example.coursedescription.module.Courses;
import com.example.coursedescription.service.CourseDescriptionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseDescriptionServiceImpl implements CourseDescriptionService {

    @Override
    public List<Courses> getAllCourses() {
        List<Courses> coursesList = new ArrayList<>();
        Courses course1 = new Courses();
        course1.setId(1L);
        course1.setCourseName("Java");
        Courses course2 = new Courses();
        course2.setId(1L);
        course2.setCourseName("Java");
        coursesList.add(course1);
        coursesList.add(course2);

        return coursesList;
    }

    @Override
    public Courses getCourseById(Long id) {
        Courses courses = new Courses();
        courses.setId(1L);
        courses.setCourseName("Java");
        return courses;
    }
}
