package com.learning.springbootthirdapp.controller;

import com.learning.springbootthirdapp.dao.PassportRepository;
import com.learning.springbootthirdapp.entity.Passport;
import com.learning.springbootthirdapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passport")
public class PassportController {

    @Autowired
    private PassportRepository passportRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/{studentName}/{passportNumber}")
    public Passport insertNewPassport(@PathVariable String studentName, @PathVariable String passportNumber){
        return passportRepository.insert(studentName, passportNumber);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/{pid}")
    public Passport getPassport(@PathVariable long pid){
        Passport passport = passportRepository.findById(pid);
        System.out.println("*********************************************************************************");
        System.out.println(passport.getStudent().getName());
        return passport;
    }

}
