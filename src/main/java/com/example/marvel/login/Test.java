package com.example.marvel.login;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
public class Test {
    
    private String name;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String secondName;
}
