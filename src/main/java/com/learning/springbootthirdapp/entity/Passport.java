package com.learning.springbootthirdapp.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

@Entity
public class Passport {

    @Id
    @GeneratedValue
    private long id;

    private String passportNo;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "passport")    //mappedBy attaribute says, I am NOT the owner. (i.e. Student is the owning side of this bidirectional mapping Student - Passport)
    @JsonManagedReference
    private Student student;




    public Passport(String passportNo) {
        this.passportNo = passportNo;
    }

    public Passport() {
    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
