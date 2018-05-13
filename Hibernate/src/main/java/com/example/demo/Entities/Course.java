package com.example.demo.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
@NamedQueries(value = {
        @NamedQuery(name = "get_all_courses", query = "Select c from Course c"),
        @NamedQuery(name = "get_all_courses_named_testowo2", query = "Select c from Course c where name='Testowo2'")})

public class Course {
    @Id
    @GeneratedValue
    private Long id;


    @Column(name="name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "course")
    List<Review> rv = new ArrayList<>();

    @ManyToMany(mappedBy = "courses")
    List <Student> students = new ArrayList<>();

    protected Course() {
    }

    public Course(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public List<Review> getRviews() {
        return rv;
    }

    public void setReview (Review review){
        rv.add(review);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rv=" + rv +
                ", students=" + students +
                '}';
    }
}
