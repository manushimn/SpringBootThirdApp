package com.learning.springbootthirdapp.dao;

import com.learning.springbootthirdapp.entity.Course;
import com.learning.springbootthirdapp.entity.Review;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addReviewsForACourse(){

        Course course = entityManager.find(Course.class, 3001l);

        Review review1 = new Review(0, "Very Bad");
        Review review2 = new Review(5, "superb");

//        course.addReview(review1);
//        course.addReview(review2);

        review1.setCourse(course);
        review2.setCourse(course);

        entityManager.persist(review1);
        entityManager.persist(review2);


    }
}
