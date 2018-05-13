package com.example.demo.Repositories;

import com.example.demo.Entities.Course;
import com.example.demo.Entities.Student;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {
    @Autowired
    EntityManager em;
    Logger logger = LoggerFactory.getLogger(this.getClass());


    //wyszukaj po id
    public Course findById(long id) {
        return em.find(Course.class, id);
    }

    //    zapisz - dodanie + edycja
    public Course save(Course course) {
//      wpis nie istnieje - dodajemy
        if (course.getId() == null)
            em.persist(course);
        else
            em.merge(course);
        return course;
    }

    //usuwanie
    public void deletyById(long id) {
        Course course = findById(id);
        em.remove(course);
    }

    public void playWithEntityManager() {
        logger.info("Jestem w metodzie playWithEntityManager");
        Course course = new Course("teeeeeeeeest");
        em.persist(course);
        Course course2 = new Course("DUPA");
        em.persist(course2);
        em.flush();

        course.setName("ZZZZZZZZZ");
        course2.setName("DDDDDDDD");
        em.refresh(course2);
    }

    public void newStudentandCourse() {
        Student student = new Student("20004");
        Course course = new Course("10005");
        em.persist(student);
        em.persist(course);
        student.addCourse(course);
        course.addStudent(student);

        em.merge(course);
        em.merge(student);
    }
}
