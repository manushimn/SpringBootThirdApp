package com.learning.springbootthirdapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

    @GeneratedValue
    @Id
    private long id;

    private int rating;

    private String description;

    @ManyToOne
    private Course course;




    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public Review() {
    }






    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
