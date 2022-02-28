package com.zc.test;

import com.zc.config.SpringCofiguration;
import com.zc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//按配置文件查找
//@ContextConfiguration("classpath:applicationContext.xml")
//按注解文件查找
@ContextConfiguration(classes = {SpringCofiguration.class})
public class SpringJunitTest {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.save();
    }
}
