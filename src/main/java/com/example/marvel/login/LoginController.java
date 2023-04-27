package com.example.marvel.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

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

}
