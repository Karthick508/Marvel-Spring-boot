package com.example.marvel.login;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login,String>{
    
    @Query(value="select * from TBL_EMPLOYEES",nativeQuery = true)
    List<Login> getSingleUser();
}
