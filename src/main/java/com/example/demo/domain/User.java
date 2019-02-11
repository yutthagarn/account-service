package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Data
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "USERNAME", length = 50, unique = true, nullable = false)
    private String username;

    @Column(name = "PASSWORD", length = 60, nullable = false)
    private String password;

    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 50, nullable = false)
    private String lastName;

    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @Column(name = "ACTIVATED", nullable = false)
    private boolean activated = true;

    public User() {
    }
}
