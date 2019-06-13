package com.codeclan.example.CourseBooking.controllers;

import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.RatingType;
import com.codeclan.example.CourseBooking.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCourseByRating(@PathVariable int rating){
        return courseRepository.getCourseByRating(rating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> getCoursesByBookingsCustomerId(@PathVariable Long id){
        return courseRepository.getCoursesByBookingsCustomerId(id);
    }


}
