package com.zc.test;

import com.zc.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcCRUDtest {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //更新
    @Test
    public void testUpdate(){
        jdbcTemplate.update("update account set money=? where name =?",3000,"曾灿");
    }

    //删除
    @Test
    public void testDelete(){
        jdbcTemplate.update("delete from account  where name =?","zz");
    }

    //查询全部
    @Test
    public void testQueryAll(){
        List<Account> accountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountList);

    }

    //查询一个
    @Test
    public void testQueryOne(){
        Account account = jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<Account>(Account.class), "曾灿");
        System.out.println(account);

    }

    //总记录数
    @Test
    public void testQueryCount(){
        Long count = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(count);
    }
}
