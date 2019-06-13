package com.codeclan.example.CourseBooking.repositories.CourseRepository;

import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.RatingType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> getCourseByRating(int rating);

    List<Course> getCoursesByBookingsCustomerId(Long Id);
}
