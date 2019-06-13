package com.codeclan.example.CourseBooking.models;

public enum RatingType {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private int value;

    RatingType(int value) {
        this.value = value;
    }
}
