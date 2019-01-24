package com.codeclan.bookingsystem.BookingSystem.controllers;


import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import com.codeclan.bookingsystem.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController  {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "course/{courseId}")
    public List<Customer> getAllCustomersByCourse(@PathVariable Long courseId){
        return customerRepository.findCustomersByCourseId(courseId);
    }

}
