package com.learning.springbootthirdapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @GeneratedValue
    @Id
    private long id;

    private String courseName;

    @OneToMany(mappedBy = "course")
    private List<Review> reviews = new ArrayList<>();




    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course() {
    }





    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void removeReview(Review review) {
        reviews.remove(review);
    }
}
