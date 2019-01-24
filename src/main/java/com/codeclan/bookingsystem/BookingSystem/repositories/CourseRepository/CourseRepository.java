package com.codeclan.bookingsystem.BookingSystem.repositories.CourseRepository;

import com.codeclan.bookingsystem.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findAllCoursesByRating(int rating);
}
