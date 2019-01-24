package com.codeclan.bookingsystem.BookingSystem.components;

import com.codeclan.bookingsystem.BookingSystem.models.Booking;
import com.codeclan.bookingsystem.BookingSystem.models.Course;
import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import com.codeclan.bookingsystem.BookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.bookingsystem.BookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.bookingsystem.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;


    public DataLoader() {


    }

    public void run(ApplicationArguments args){


        Customer customer1 = new Customer("James", "Duns", 19);
        customerRepository.save(customer1);

        Course course1 = new Course("Cooking Intro", "Inverness", 1);
        courseRepository.save(course1);

        Course course2 = new Course("Cooking Advanced", "Inverness", 2);
        courseRepository.save(course2);

        Booking booking1  = new Booking("01-01-2019", customer1, course1);
        bookingRepository.save(booking1);


    }
}
