package com.example.demo.RepositoriesTests;


import com.example.demo.DemoApplication;
import com.example.demo.Entities.Course;
import com.example.demo.Entities.Passport;
import com.example.demo.Entities.Student;
import com.example.demo.Repositories.StudentRepositories;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)

public class StudentRepositoryTests {
    @Autowired
    EntityManager em;

    @Autowired
    StudentRepositories studentRepositories;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    @Transactional
    public void findByIdPassport(){
        Student student = studentRepositories.findById(20001);
        Passport passport = student.getPassport();

        logger.info("STUDENT: {}", student);
        logger.info("PASSPORT: {}", passport);
    }

    @Test
    @Transactional
    public void EntityTest(){
        Student student = studentRepositories.findById(20010);
        Passport passport = student.getPassport();

        passport.setNumber("ZZZZZZZZZ");
        student.setName("ZZZZZZZZZ");
    }

    @Test
    @Transactional
    public void getStudentViaPassport(){
        Passport passport = em.find(Passport.class,40001L);
        Student student = passport.getStudent();
        logger.info("PASSPORT: {}",passport);
        logger.info("STUDENT: {}",student);
    }

    @Test
    @Transactional
    public void getStudentAndAllCourses(){
        Student student = em.find(Student.class, 20001L);
        logger.info("STUDENT: {}", student);
        List<Course> courses = student.getCourses();
        logger.info("COURSES: {}", courses);
    }
}
