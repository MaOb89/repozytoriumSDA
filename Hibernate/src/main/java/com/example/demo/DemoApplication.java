package com.example.demo;

import com.example.demo.Entities.Course;
import com.example.demo.Entities.Student;
import com.example.demo.Repositories.CourseRepository;
import com.example.demo.Repositories.ReviewRespositories;
import com.example.demo.Repositories.StudentRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    StudentRepositories studentRepositories;

    @Autowired
    ReviewRespositories reviewRespositories;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        reviewRespositories.addNewCourse();
//        studentRepositories.saveStudentWithPassport();
//	Course course =	courseRepository.findById(10001L);
//	logger.info("Course 10001 -> {}",course);
//		courseRepository.deletyById(10001);
//        courseRepository.playWithEntityManager();
    }
}
