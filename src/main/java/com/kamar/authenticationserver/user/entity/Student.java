package com.kamar.authenticationserver.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;

import java.time.LocalDate;

/**
 * entity representing a student.
 * @author kamar baraka.*/

@Entity
@Data
public class Student {

    @Id
    @Column(name = "reg_No", nullable = false, unique = true,updatable = false)
    private String regNo;
    @Email
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "firstname", nullable = false)
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    private final LocalDate createdOn = LocalDate.now();
}
