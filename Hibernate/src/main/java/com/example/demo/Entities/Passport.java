package com.example.demo.Entities;

import javax.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String Number;

    @OneToOne(mappedBy = "passport", fetch =FetchType.LAZY)
    private Student student;

    protected Passport(){}
    public Passport(String number){this.Number=number;}

    public Long getId() {
        return id;
    }
    public String getNumber() {
        return Number;
    }

    public void setId(Long id) {
        id = id;
    }
    public void setNumber(String number) {
        Number = number;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "Number='" + Number + '\'' +
                '}';
    }
}
