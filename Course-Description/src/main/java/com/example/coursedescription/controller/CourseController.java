package com.example.coursedescription.controller;

import com.example.coursedescription.service.CourseDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseDescriptionService courseDescriptionService;

    @GetMapping("/")
    public ResponseEntity<?> getAllBooks() {
        return ResponseEntity.ok(courseDescriptionService.getAllCourses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Long id) {
        return ResponseEntity.ok(courseDescriptionService.getCourseById(id));
    }

}
