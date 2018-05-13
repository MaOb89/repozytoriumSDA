package com.example.demo.RepositoriesTests;

import com.example.demo.DemoApplication;
import com.example.demo.Entities.Course;
import com.example.demo.Entities.Review;
import com.example.demo.Repositories.CourseRepository;
import com.example.demo.Repositories.ReviewRespositories;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)

public class ReviewRepositoryTests {
    @Autowired
    EntityManager em;

    @Autowired
    ReviewRespositories reviewRespositories;

    @Autowired
    CourseRepository courseRepository;

    Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Test
//    @Transactional
//    public void retrieveReviewsForCourse(){
//        Course course = courseRepository.findById(10005);
//        logger.info("course -> {}", course);
//    }

//    @Test
//    @Transactional
//    public void retrieveCourseForReview(){
//        Review review = em.find(Review.class, 40005L);
//        Course course=review.getCourse();
//        logger.info("review -> {}", review);
//        logger.info("course-> {}", course);
//    }
}
