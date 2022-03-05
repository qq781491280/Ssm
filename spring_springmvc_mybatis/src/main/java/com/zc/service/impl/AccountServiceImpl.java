package com.zc.service.impl;

import com.zc.domain.Account;
import com.zc.mapper.AccountMapper;
import com.zc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
