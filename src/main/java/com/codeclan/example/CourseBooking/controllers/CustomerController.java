package com.codeclan.example.CourseBooking.controllers;

import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;


    @GetMapping(value="/course/{id}")
    public List<Customer> getCustomerByCourseId(@PathVariable Long id){
        return customerRepository.getCustomerByBookingsCourseId(id);
    }

    @GetMapping(value = "/course/{id}/town/{town}")
    public List<Customer> getCustomerByCoursesTownAndBookingsCourseId(@PathVariable String town, @PathVariable Long id){
        return customerRepository.getCustomerByBookingsCourseTownAndBookingsCourseId(town, id);
    }

    @GetMapping(value = "/age/{age}/course/{id}/town/{town}")
    public List<Customer> getCustomerByAgeGreaterThanAndByBookingsCourseTownAndByBookingsCourseId(@PathVariable int age, @PathVariable String town, @PathVariable Long id) {
        return customerRepository.getCustomersOverAgeByTownAndCourse(age, town, id);
    }

}
