package com.zc.service;

import com.zc.domain.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);
    List<Account> findAll();
}
