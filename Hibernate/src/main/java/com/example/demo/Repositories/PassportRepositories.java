package com.example.demo.Repositories;
import com.example.demo.Entities.Passport;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PassportRepositories {
    @Autowired
    EntityManager em;
//    Logger logger = LoggerFactory.getLogger(this.getClass());

    //wyszukaj po id
    public Passport findById(long id) {
        return em.find(Passport.class,id);
    }

    //    zapisz - dodanie + edycja
    public Passport save (Passport passport){
//      wpis nie istnieje - dodajemy
        if(passport.getId()==null)
            em.persist(passport);
        else
            em.merge(passport);
        return passport;
    }

    //usuwanie
    public void deletyById(long id){
        Passport passport = findById(id);
        em.remove(passport);
    }
}
