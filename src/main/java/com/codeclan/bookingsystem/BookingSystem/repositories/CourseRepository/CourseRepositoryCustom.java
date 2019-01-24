package com.codeclan.bookingsystem.BookingSystem.repositories.CourseRepository;

import com.codeclan.bookingsystem.BookingSystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findCourseByCustomerId(Long customerId);

}