package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
@AllArgsConstructor
@Data
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "CITIZEN_ID")
    private Long citizenId;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "ACCOUNT_NUMBER")
    private Long accountNumber;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "BALANCE")
    private Long balance;

    @Column(name = "CURRENCY")
    private String currency;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    public Account() {
    }
}
