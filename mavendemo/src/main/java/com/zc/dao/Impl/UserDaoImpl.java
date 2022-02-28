package com.zc.dao.Impl;

import com.zc.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建");
    }

    @Override
    public void save() {
        System.out.println("save.......");
    }
}
