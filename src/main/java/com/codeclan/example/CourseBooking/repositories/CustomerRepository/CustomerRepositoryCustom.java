package com.codeclan.example.CourseBooking.repositories.CustomerRepository;

import com.codeclan.example.CourseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getCustomersOverAgeByTownAndCourse(int age, String town, Long id);
}
