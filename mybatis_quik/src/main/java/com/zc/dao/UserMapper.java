package com.zc.dao;

import com.zc.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
     List<User> findAll() throws IOException;
    User findById(int id);

}
