package com.example.mytest.repository;

import com.example.mytest.entity.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepoImpl implements RoleRepo{
    EntityManager entityManager;

    RoleRepoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    public Role findRoleByName(String roleName) {
        TypedQuery<Role> theQuery = entityManager.createQuery("from Role where name=:theRole",Role.class);
        theQuery.setParameter("theRole",roleName);
        Role theRole = null;
        try{
            theRole = theQuery.getSingleResult();
        }catch (Exception e){
            theRole = null;
        }
        return theRole;
    }
}
