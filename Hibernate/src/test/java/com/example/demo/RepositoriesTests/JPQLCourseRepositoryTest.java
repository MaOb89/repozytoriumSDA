package com.example.demo.RepositoriesTests;

import com.example.demo.DemoApplication;
import com.example.demo.Entities.Course;
import com.example.demo.Repositories.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class JPQLCourseRepositoryTest {
    @Autowired
    EntityManager em;

    @Autowired
    CourseRepository courseRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void getAllCoursesTest() {
        List results = em.createQuery("SELECT c from Course c").getResultList();
        logger.info("Wynik => {}", results);
    }

    @Test
    public void findWhere() {
        TypedQuery<Course> query = em.createQuery("Select c from Course c where name = Testowo2", Course.class);
        List resultlist = query.getResultList();
        logger.info("Wynik where -> {}", resultlist);
    }

    @Test
    public void findWhere3() {
        TypedQuery<Course> query = em.createQuery("Select c from Course c where name like '%3%'", Course.class);
        List resultlist = query.getResultList();
        logger.info("Wynik where -> {}", resultlist);
    }

    @Test
    public void findWhereTEST() {
        TypedQuery<Course> query = em.createQuery("Select c from Course c where name like '%Test%'", Course.class);
        List resultlist = query.getResultList();
        logger.info("Wynik where -> {}", resultlist);
    }

    @Test
    public void getAllCoursesTestCAPSLOCK() {
        List results = em.createQuery("SELECT upper(c.name) from Course c").getResultList();
        logger.info("Wynik => {}", results);

    }

//    @Test
//    public void findById() {
//        List resultList = em.createNamedQuery("get_all_courses").getResultList();
//        logger.info("Wynik -> {}", resultList);
//    }

}