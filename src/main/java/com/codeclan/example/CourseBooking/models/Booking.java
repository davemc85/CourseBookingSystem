package com.codeclan.example.CourseBooking.models;

import javax.persistence.*;


@Entity
@Table(name="bookings" )
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String date;
    @ManyToOne
    @JoinColumn(name = "course", nullable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "customer", nullable = false)
    private Course course;


    public Booking(String date, Customer customer, Course course) {
        this.date = date;
        this.course = course;
        this.customer = customer;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void createBooking(Customer customer, Course course, String date){
        Booking newBooking = new Booking(date, customer, course);
    }
}
