package com.example.marvel.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
public class ThreadTestImpl implements ThreadService{

    @Autowired
    LoginService mainServie;

    @Override
    public void testAsync() {

        long startTime = System.currentTimeMillis();

        List<Login> first = mainServie.getAllUsers1();
        List<Login> second = mainServie.getAllUsers2();
        List<Login> third = mainServie.getAllUsers3();
        List<Login> fourth = mainServie.getAllUsers4();
        List<Login> fifth = mainServie.getAllUsers5();
        List<Login> sixth = mainServie.getAllUsers6();
        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime) / 1000;
        System.out.println(seconds + "-Seconds-->testAsync()");

    }

}
