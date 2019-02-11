package com.example.demo.repository;

import com.example.demo.domain.Account;
import com.example.demo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Page<Account> findByUser(User user, Pageable pageable);

}
