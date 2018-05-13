package com.example.demo.RepositoriesTests;

import com.example.demo.DemoApplication;
import com.example.demo.Entities.Course;
import com.example.demo.Repositories.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;
    @Autowired
    EntityManager em;

    @Test
    public void findById(){
        Course course = courseRepository.findById(10001);
        assertEquals("Testowo", course.getName());
    }

    @Test
    @DirtiesContext
    public void deleteByIdSimple(){
        courseRepository.deletyById(10002);
        assertEquals(null, courseRepository.findById(10002));
    }

    @Test
    @DirtiesContext
    public void saveEdit(){
        Course course = courseRepository.findById(10002);

        course.setName("Testowo - updated");
        courseRepository.save(course);

            Course course1 = courseRepository.findById(10002);
            assertEquals("Testowo - updated", course1.getName());
    }

    @Test
    @DirtiesContext
    public void SafeInsert(){
        Course course = courseRepository.findById(1);
        assertNull(course);

        course = new Course("Testowo - insert");
        courseRepository.save(course);

        Course course1 = courseRepository.findById(1);
        assertEquals("Testowo - insert", course.getName());
    }

    @Test
    @DirtiesContext
    public void playWithEntityManager(){
        courseRepository.playWithEntityManager();
    }

}
