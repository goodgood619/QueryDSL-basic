package com.example.querydsl.repository;

import com.example.querydsl.domain.Account;
import com.example.querydsl.domain.QAccount;
import com.querydsl.core.types.Predicate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;


@DataJpaTest
public class QueryDSLTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void testCrud() {
        Account account = new Account();
        account.setFirstName("GoodGood");
        account.setLastName("Lee");

        accountRepository.save(account);

        Predicate predicate =  QAccount.account
                .firstName.contains("GoodGood")
                .and(QAccount.account.lastName.startsWith("Le"));

        Optional<Account> one = accountRepository.findOne(predicate);


        System.out.println(one.get());
    }
}
