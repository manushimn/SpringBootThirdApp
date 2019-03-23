package com.learning.springbootthirdapp;

import com.learning.springbootthirdapp.dao.CourseRepository;
import com.learning.springbootthirdapp.dao.StudentRepository;
import com.learning.springbootthirdapp.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootThirdAppApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void contextLoads() {
    }

    @Transactional
    @Test
    public void retrievePassportAndAssociatedStudent(){
        Student student = studentRepository.findById(1001);
        System.out.println("*********************************************************************************");
        System.out.println(student.getPassport().getPassportNo());

    }



}

