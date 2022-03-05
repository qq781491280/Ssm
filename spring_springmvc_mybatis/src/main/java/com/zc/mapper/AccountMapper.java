package com.zc.mapper;

import com.zc.domain.Account;

import java.util.List;

public interface AccountMapper {
    void save(Account account);
    List<Account> findAll();
}
