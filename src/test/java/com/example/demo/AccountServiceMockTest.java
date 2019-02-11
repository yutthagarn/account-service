package com.example.demo;

import com.example.demo.domain.Account;
import com.example.demo.domain.User;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.impl.AccountServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceMockTest {

    @Mock
    AccountRepository accountRepositoryMock;

    @Mock
    UserRepository userRepositoryMock;

    @InjectMocks
    AccountServiceImpl accountServiceImpl;

    @Test
    public void testNewAccount() {
        Account account = new Account();
        account.setId(1L);
        account.setAccountName("Yutthagarn Ken");
        account.setAccountNumber(120032022155L);
        account.setAccountType("Saving");
        account.setBalance(500000L);
        account.setCitizenId(1500422601248L);
        account.setCurrency("THB");

        when(accountRepositoryMock.save(any())).thenReturn(account);
        when(userRepositoryMock.findByUsername(any())).thenReturn(new User());
        Assertions.assertThat(accountServiceImpl.openNewAccount(account).getAccountName()).isEqualTo("Yutthagarn Ken");
    }
}
