package com.codeclan.example.CourseBooking.components;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.models.RatingType;
import com.codeclan.example.CourseBooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer david = new Customer("David", "Kirky", 33);
        customerRepository.save(david);

        Customer john = new Customer("John", "PollockShields", 31);
        customerRepository.save(john);

        Course python = new Course("Intro to Python", "Glasgow", 4);
        courseRepository.save(python);

        Course introR = new Course("Intro to R", "Inverness", 2);
        courseRepository.save(introR);

        Booking booking1 = new Booking("28-02-2019", david, introR);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("24-12-2018", john, python);
        bookingRepository.save(booking2);


        List<Customer> found = customerRepository.getCustomersOverAgeByTownAndCourse(20, "Glasgow", 1L);
    }
}
