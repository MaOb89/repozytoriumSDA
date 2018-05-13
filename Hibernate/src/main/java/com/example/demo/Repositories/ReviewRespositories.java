package com.example.demo.Repositories;

import com.example.demo.Entities.Course;
import com.example.demo.Entities.Review;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
    @Transactional
    public class ReviewRespositories {
        @Autowired
        EntityManager em;
//    Logger logger = LoggerFactory.getLogger(this.getClass());

        //wyszukaj po id
        public Review findById(long id) {
            return em.find(Review.class,id);
        }

        //usuwanie
        public void deletyById(long id) {
            Review review = findById(id);
            em.remove(review);
        }

        //    zapisz - dodanie + edycja
        public Review save (Review review){
//      wpis nie istnieje - dodajemy
            if(review.getId()==null)
                em.persist(review);
            else
                em.merge(review);
            return review;
        }

        public void saveCourseAndReviews(){
            Course course = em.find(Course.class, 10001L);
            Review r1 = new Review("3", "AAAA");
            Review r2 = new Review("5", "BBBB");
            em.persist(r1);
            em.persist(r2);

            r1.setCourse(course);
            r2.setCourse(course);

            course.setReview(r1);
            course.setReview(r2);

            em.merge(course);
        }

        public void addNewCourse(){
            Course course = new Course("Testowo6");

            Review r1 = new Review("8", "MMMMM");
            Review r2 = new Review("10", "NNNNN");
            em.persist(course);

            r1.setCourse(course);
            r2.setCourse(course);

            course.setReview(r1);
            course.setReview(r2);

            em.merge(course);

        }

        public void AddReviewsForCourse(Long id, List<Review> rewievs){
          Course course = em.find(Course.class,id);

            for (Review review: rewievs) {
                course.setReview(review);
                review.setCourse(course);
                em.persist(review);
            }
        }

        public void addRevisionForCourseTest(){
            Review r1 = new Review("3","DDDDD");
            Review r2 = new Review("5","GGGG");

            ArrayList<Review> reviews = new ArrayList<>();
            reviews.add(r1);
            reviews.add(r2);

            AddReviewsForCourse(10001L, reviews);
        }
    }

