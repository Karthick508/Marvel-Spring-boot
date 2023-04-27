package com.example.marvel.login;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    LoginRepo loginRepo;

    @Override
    public List<Login> getAllUsers() {

        String query = "select * from TBL_EMPLOYEES";
        Query appendedQuery = entityManager.createNativeQuery(query.toString());
        List<Login> allUsers = appendedQuery.getResultList();

        List<Login> allUsersFromRepo = loginRepo.getSingleUser();

        return allUsersFromRepo;
    }

}
