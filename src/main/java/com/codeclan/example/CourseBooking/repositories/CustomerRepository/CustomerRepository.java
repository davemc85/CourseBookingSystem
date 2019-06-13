package com.codeclan.example.CourseBooking.repositories.CustomerRepository;

import com.codeclan.example.CourseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom{
}
