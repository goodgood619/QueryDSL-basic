package com.example.querydsl.repository;

import com.example.querydsl.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface AccountRepository extends JpaRepository<Account,Long>, QuerydslPredicateExecutor<Account> {

}
