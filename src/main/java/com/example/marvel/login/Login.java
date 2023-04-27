package com.example.marvel.login;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.Data;
import javax.persistence.Id;


@Data
@Entity
public class Login {
    @Id
    private BigDecimal id;
    private String last_name;
    private String first_name;
    private String email;
}
