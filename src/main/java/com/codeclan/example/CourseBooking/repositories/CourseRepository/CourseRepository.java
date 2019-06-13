package com.codeclan.example.CourseBooking.repositories.CourseRepository;

import com.codeclan.example.CourseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
