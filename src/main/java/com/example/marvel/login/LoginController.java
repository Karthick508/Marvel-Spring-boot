package com.example.marvel.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/getApiTest")
    public String testApi(final HttpServletRequest request,
            HttpServletResponse response) {

        try {
        } catch (Exception e) {
        }

        return "Get Mapping Success";
    }

}
