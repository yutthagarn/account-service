package com.example.demo.rest;


import com.example.demo.domain.Account;
import com.example.demo.domain.User;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.SecurityUtils;
import com.example.demo.service.AccountService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountRest {

    private AccountService accountService;
    private AccountRepository accountRepository;
    private UserRepository userRepository;

    public AccountRest(AccountService accountService, AccountRepository accountRepository, UserRepository userRepository) {
        this.accountService = accountService;
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/new")
    public Account openNewAccount(@RequestBody Account account) {
        return accountService.openNewAccount(account);
    }

    @GetMapping
    public Page<Account> getAllAccount(Pageable pageable) {
        User user = userRepository.findByUsername(SecurityUtils.getCurrentUserLogin());
        return accountRepository.findByUser(user, pageable);
    }

}
