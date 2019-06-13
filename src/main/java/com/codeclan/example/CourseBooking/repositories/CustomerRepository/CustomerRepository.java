package com.codeclan.example.CourseBooking.repositories.CustomerRepository;

import com.codeclan.example.CourseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom{

    List<Customer> getCustomerByBookingsCourseId(Long id);

    List<Customer> getCustomerByBookingsCourseTownAndBookingsCourseId(String town, Long id);

}
