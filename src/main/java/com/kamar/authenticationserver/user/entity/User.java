package com.kamar.authenticationserver.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * normal user of the system.
 * @author kamar baraka.*/

@Entity(name = "users")
@Data
public class User {

    @Id
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "D.O.B")
    private LocalDateTime dateOfBirth;

    private boolean enabled;

    private final LocalDate createdOn = LocalDate.now();


}
