package com.example.marvel.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @Autowired
    ThreadService threadService;

    @GetMapping("/getApiTest")
    public String testApi(final HttpServletRequest request,
            HttpServletResponse response) {

        try {
        } catch (Exception e) {
        }

        return "Get Mapping Success";
    }

    @GetMapping("/getAllUsers")
    public List<Login> getAllUsers(final HttpServletRequest request, HttpServletResponse response) {
        List<Login> allUsers = loginService.getAllUsers();
        return allUsers;

    }

    @GetMapping("/ignoreKey")
    public Test ignoreKey(final HttpServletRequest request, HttpServletResponse response) {
        Test test = new Test();
        test.setName("kathick");
        // test.setSecondName("123");
        return test;

    }
    @GetMapping("/getAllUsers2")
    public List<Login> getAllUsers2(final HttpServletRequest request, HttpServletResponse response) {
        List<Login> allUsers = loginService.getAllUsers2();
        return allUsers;

    }
    @GetMapping("/getAllUsers3")
    public List<Login> getAllUsers3(final HttpServletRequest request, HttpServletResponse response) {
        List<Login> allUsers = loginService.getAllUsers3();
        return allUsers;

    }
    @GetMapping("/getAllUsers4")
    public List<Login> getAllUsers4(final HttpServletRequest request, HttpServletResponse response) {
        List<Login> allUsers = loginService.getAllUsers4();
        return allUsers;

    }
    @GetMapping("/getAllUsers5")
    public List<Login> getAllUsers5(final HttpServletRequest request, HttpServletResponse response) {
        List<Login> allUsers = loginService.getAllUsers5();
        return allUsers;

    }
    @GetMapping("/getAllUsers6")
    public List<Login> getAllUsers6(final HttpServletRequest request, HttpServletResponse response) {
        List<Login> allUsers = loginService.getAllUsers6();
        return allUsers;

    }

    @GetMapping("/parellelStream")
    public void parellelStream(final HttpServletRequest request, HttpServletResponse response) {
        try {
            loginService.parellelStreams();
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @GetMapping("/asyncTest")
    public void asyncTest(final HttpServletRequest request, HttpServletResponse response) {
        threadService.testAsync();
    }

    @GetMapping("/my-endpoint")
    public List<String> getResult() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "hello");
        String result = future.join();
        return Arrays.asList(result);
    }

    @GetMapping("/getAllUsers11")
    public CompletableFuture<Object> getAllUsers11() {
        CompletableFuture<List<Login>> future = CompletableFuture.supplyAsync(() -> loginService.getAllUsers11());
        CompletableFuture<List<Login>> future1 = CompletableFuture.supplyAsync(() -> loginService.getAllUsers10());

        // CompletableFuture< List<Login>> future2 = CompletableFuture.supplyAsync(() ->
        // loginService.getAllUsers9());
        // CompletableFuture< List<Login>> future3 = CompletableFuture.supplyAsync(() ->
        // loginService.getAllUsers11());
        // CompletableFuture< List<Login>> future4 = CompletableFuture.supplyAsync(() ->
        // loginService.getAllUsers11());
        // List<Login> result = future.join();
        return future.thenApply(result -> Arrays.asList(result));
    }

    @GetMapping("/my-endpointTest")
    public List<Login> getResultTest() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(6);
        
        Future <List<Login>> future1 = executor.submit(() -> loginService.getAllUsers2());
        Future <List<Login>> future2 = executor.submit(() -> loginService.getAllUsers3());
        Future <List<Login>> future4 = executor.submit(() -> loginService.getAllUsers4());
        // Future <List<Login>> future5 = executor.submit(() -> loginService.getAllUsers5());
        // Future <List<Login>> future9 = executor.submit(() -> loginService.getAllUsers1());
        // Future <List<Login>> future10 = executor.submit(() -> loginService.getAllUsers6());
        
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        
        List<Login> results = new ArrayList<>();
        results.addAll(future1.get());
        results.addAll(future4.get());
        results.addAll(future2.get());
        // results.addAll(future9.get());
        // results.addAll(future5.get());
        // results.addAll(future10.get());
        
        return results;
    }

}
