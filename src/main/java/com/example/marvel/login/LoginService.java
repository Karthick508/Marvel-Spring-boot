package com.example.marvel.login;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface LoginService {
    
    List<Login> getAllUsers();
    List<Login> getAllUsers1();
    List<Login> getAllUsers2();
    List<Login> getAllUsers3();
    List<Login> getAllUsers4();
    List<Login> getAllUsers5();
    List<Login> getAllUsers6();
    List<Login> getAllUsers11();
    List<Login> getAllUsers10();
    List<Login> getAllUsers9();

    public CompletableFuture<List<List<Login>>> parellelStreams() throws InterruptedException, ExecutionException;
}
