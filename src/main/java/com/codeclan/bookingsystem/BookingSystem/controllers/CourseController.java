package com.codeclan.bookingsystem.BookingSystem.controllers;

import com.codeclan.bookingsystem.BookingSystem.models.Course;
import com.codeclan.bookingsystem.BookingSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @RequestMapping("ratings/{rating}")
    public List<Course>getAllCoursesByRating(@PathVariable int rating){
        return courseRepository.findAllCoursesByRating(rating);
    }
}
