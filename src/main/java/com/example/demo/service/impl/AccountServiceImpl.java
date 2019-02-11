package com.example.demo.service.impl;

import com.example.demo.domain.Account;
import com.example.demo.domain.User;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.SecurityUtils;
import com.example.demo.service.AccountService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;
    private UserRepository userRepository;

    public AccountServiceImpl(AccountRepository accountRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Account openNewAccount(Account account) {
        User user = userRepository.findByUsername(SecurityUtils.getCurrentUserLogin());
        account.setUser(user);
        return accountRepository.save(account);
    }
}
