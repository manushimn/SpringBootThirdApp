package com.learning.springbootthirdapp.dao;

import com.learning.springbootthirdapp.entity.Passport;
import com.learning.springbootthirdapp.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Student insert(String studentName, String passportNo){

        Passport passport = new Passport(passportNo);
        entityManager.persist(passport);

        Student student = new Student(studentName);
        student.setPassport(passport);
        entityManager.persist(student);

        return student;
    }

    public Student findById(long sid) {
        return entityManager.find(Student.class, sid);
    }
}
