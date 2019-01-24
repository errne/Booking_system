package com.codeclan.bookingsystem.BookingSystem.repositories.CustomerRepository;

import com.codeclan.bookingsystem.BookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersByCourseId(Long courseId);
    List<Customer> findCustomersByCourseIdandTown( Long courseId, String town);

    List<Customer> findCustomersByCourseIdAndTownAndOverAge( Long courseId, String town, int age);

}
