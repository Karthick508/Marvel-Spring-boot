package com.example.marvel.login;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.var;

@Service
@Transactional
@Configuration
@EnableAsync
public class LoginServiceImpl implements LoginService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    LoginRepo loginRepo;

    @Override
    public List<Login> getAllUsers() {

        long startTime = System.currentTimeMillis();
        // wait for activity here
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        List<Login> first = getAllUsers1();
        List<Login> second = getAllUsers2();
        List<Login> third = getAllUsers3();
        List<Login> fourth = getAllUsers4();
        List<Login> fifth = getAllUsers5();
        // List<Login> sixth = getAllUsers6();
        // List<Login> seventh = getAllUsers7();
        // List<Login> eight = getAllUsers8();
        // List<Login> nineth = getAllUsers9();
        // List<Login> tenth = getAllUsers10();

        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime) / 1000;
        System.out.println(seconds + "-Seconds --> getAllUsers()");
        return allUsersFromRepo;
    }

    @Override
    public CompletableFuture<List<List<Login>>> parellelStreams() throws InterruptedException, ExecutionException {
        List<Login> movies = loginRepo.getSingleUser();

        // Asynchronous execution
        Executor executor = Executors.newFixedThreadPool(10);
        long startTime = System.currentTimeMillis();
        var futureMovies = movies.stream().map(m -> CompletableFuture.supplyAsync(() -> getAllUsers1(), executor));
        // var topMovies = futureMovies.stream().map(CompletableFuture::join).collect(toList());
        System.out.println("futureMovies" + futureMovies);
        long end = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime) / 1000;
        System.out.println(seconds + "-Seconds --> getAllUsers()");
        // Synchronous execution
        // start = System.currentTimeMillis();
        // topMovies = movies.stream().map(m -> omdbService.enrichMovieWithBoxOfficeValue(m)).collect(Collectors.toList());
        // end = System.currentTimeMillis();
        // System.out.printf("The normal operation took %s ms%n", end - start);

        // topMovies.sort((o1, o2) -> o2.getBoxOffice().compareTo(o1.getBoxOffice()));
        return null;

    }

    @Override
    public List<Login> getAllUsers1() {

        System.out.println("Started-->getAllUsers1()");
        long startTime = System.currentTimeMillis();

        List<Login> allUsersFromRepo = loginRepo.getSingleUser1();

        long endTime = System.currentTimeMillis();
        System.out.println("getAllUsers1()" + (startTime - endTime) / 1000 + "in Seconds->");
        return allUsersFromRepo;
    }

    @Override
    public List<Login> getAllUsers2() {
        System.out.println("Started-->getAllUsers2()");
        long startTime = System.currentTimeMillis();

        List<Login> allUsersFromRepo = loginRepo.getSingleUser2();

        long endTime = System.currentTimeMillis();
        System.out.println("getAllUsers2()" + (startTime - endTime) / 1000 + "in Seconds->");
        return allUsersFromRepo;
    }

    @Override
    public List<Login> getAllUsers3() {
        System.out.println("Started-->getAllUsers3()");
        long startTime = System.currentTimeMillis();

        List<Login> allUsersFromRepo = loginRepo.getSingleUser3();
        long endTime = System.currentTimeMillis();
        System.out.println("getAllUsers3()" + (startTime - endTime) / 1000 + "in Seconds->");
        return allUsersFromRepo;
    }

    @Override
    public List<Login> getAllUsers4() {
        System.out.println("Started-->getAllUsers4()");
        long startTime = System.currentTimeMillis();
        List<Login> allUsersFromRepo = loginRepo.getSingleUser4();

        long endTime = System.currentTimeMillis();
        System.out.println("getAllUsers4()" + (startTime - endTime) / 1000 + "in Seconds->");
        return allUsersFromRepo;
    }

    @Override
    public List<Login> getAllUsers5() {
        System.out.println("Started-->getAllUsers5()");
        long startTime = System.currentTimeMillis();
        List<Login> allUsersFromRepo = loginRepo.getSingleUser5();

        long endTime = System.currentTimeMillis();
        System.out.println("getAllUsers5()" + (startTime - endTime) / 1000 + "in Seconds->");
        return allUsersFromRepo;
    }

    @Override
    public List<Login> getAllUsers6() {
        System.out.println("Started-->getAllUsers6()");
        long startTime = System.currentTimeMillis();

        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        long endTime = System.currentTimeMillis();
        System.out.println("getAllUsers6()" + (startTime - endTime) / 1000 + "in Seconds->");

        return allUsersFromRepo;
    }

    public List<Login> getAllUsers7() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers8() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    @Override
    public List<Login> getAllUsers9() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    @Override
    public List<Login> getAllUsers10() {
        System.out.println("supplyAsync Thread name " + Thread.currentThread().getName());
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    @Override
    public List<Login> getAllUsers11() {
        System.out.println("Started-->getAllUsers11()");
        long startTime = System.currentTimeMillis();
        System.out.println("supplyAsync Thread name " + Thread.currentThread().getName());
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        long endTime = System.currentTimeMillis();
        System.out.println("getAllUsers11()" + (startTime - endTime) / 1000 + "in Seconds->");
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers12() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers13() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers14() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers15() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers16() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers17() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers18() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers19() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers20() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers21() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers22() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers23() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers24() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers25() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers26() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers27() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers28() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers29() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers30() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers31() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers32() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers33() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers34() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers35() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers36() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers37() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers38() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers39() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers40() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers41() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers42() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers43() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers44() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers45() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers46() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers47() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers48() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers49() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public List<Login> getAllUsers50() {
        List<Login> allUsersFromRepo = loginRepo.getSingleUser();
        return allUsersFromRepo;
    }

    public void insert() {
        int i = 10;

        for (int j = 100001; j <= 1000000; j++) {
            String insertQuery = "insert into TBL_EMPLOYEES values(?,?,?,?)";
            StringBuilder sb = new StringBuilder(insertQuery);
            Query query = entityManager.createNativeQuery(insertQuery.toString());
            String generatedString = RandomStringUtils.randomAlphabetic(10);
            query.setParameter(1, j);
            query.setParameter(2, generatedString);
            query.setParameter(3, generatedString);
            query.setParameter(4, generatedString);
            int execute = query.executeUpdate();
            System.out.println("Loop-->" + j);
        }
    }
}
