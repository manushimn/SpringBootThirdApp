package com.learning.springbootthirdapp;

import com.learning.springbootthirdapp.dao.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class SpringBootThirdAppApplication implements CommandLineRunner {


    @Autowired
    CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThirdAppApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception{
        courseRepository.addReviewsForACourse();
        courseRepository.addStudentsAndCourses();
    }
}

