package com.example.mytest.repository;

import com.example.mytest.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepoImpl implements UserRepo {
    EntityManager entityManager;

    UserRepoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public User findByUserName(String username) {
        TypedQuery<User> theQuery = entityManager.createQuery("from User where userName=:theName",User.class);
        theQuery.setParameter("theName",username);

        User theUser = null;
        try{
            theUser = theQuery.getSingleResult();
        }catch(Exception e){
            theUser = null;
        }
        return theUser;
    }
}
