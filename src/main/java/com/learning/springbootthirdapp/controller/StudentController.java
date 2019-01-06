package com.learning.springbootthirdapp.controller;

import com.learning.springbootthirdapp.dao.StudentRepository;
import com.learning.springbootthirdapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/{studentName}/{passportNumber}")
    public Student insertNewStudent(@PathVariable String studentName, @PathVariable String passportNumber){
        return studentRepository.insert(studentName, passportNumber);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{sid}")
    public Student getStudent(@PathVariable long sid){
        Student student = studentRepository.findById(sid);
        System.out.println("*********************************************************************************");
        System.out.println(student.getPassport().getPassportNo());
        return student;
    }

}
