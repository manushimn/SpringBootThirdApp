package com.learning.springbootthirdapp.dao;

import com.learning.springbootthirdapp.entity.Passport;
import com.learning.springbootthirdapp.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PassportRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Passport insert(String studentName, String passportNo){

        Student student = new Student(studentName);
        entityManager.persist(student);

        Passport passport = new Passport(passportNo);
        passport.setStudent(student);
        entityManager.persist(passport);

        return passport;
    }

    public Passport findById(long passportId) {
        return entityManager.find(Passport.class, passportId);
    }
}
