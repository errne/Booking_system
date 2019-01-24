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

        Customer customer3 = new Customer("Jamesina", "Duns", 15);
        customerRepository.save(customer3);

        Customer customer2 = new Customer("Jim", "Funs", 97);
        customerRepository.save(customer2);

        Course course1 = new Course("Cooking Intro", "Inverness", 0);
        courseRepository.save(course1);

        Course course2 = new Course("Cooking Advanced", "Inverness", 3);
        courseRepository.save(course2);

        Booking booking1  = new Booking("01-01-2019", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("02-02-2019", customer2, course1);
        bookingRepository.save(booking2);

        Booking booking3  = new Booking("02-01-2019", customer1, course2);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("10-01-2019", customer3, course1);
        bookingRepository.save(booking4);


    }
}
