package com.example.demo.Repositories;

import com.example.demo.Entities.Passport;
import com.example.demo.Entities.Student;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional

public class StudentRepositories {
    @Autowired
    EntityManager em;
    Logger logger = LoggerFactory.getLogger(this.getClass());


    //wyszukaj po id
    public Student findById(long id) {
        return em.find(Student.class,id);
    }

    //    zapisz - dodanie + edycja
    public Student save (Student student){
//      wpis nie istnieje - dodajemy
        if(student.getId()==null)
            em.persist(student);
        else
            em.merge(student);
        return student;
    }

    //usuwanie
    public void deletyById(long id){
        Student student = findById(id);
        em.remove(student);
    }

    public void saveStudentWithPassport(){
        Passport pass = new Passport("AAAAAAA");
        em.persist(pass);
        Student student = new Student("AAAAAAA");
        student.setPassport(pass);
        em.persist(student);
    }
}

