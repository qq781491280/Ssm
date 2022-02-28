package com.zc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zc.pojo.User;
import com.zc.pojo.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
//一级目录
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quick")
    public String save(){
        System.out.println("Controller save running...");
        return"success";
    }

    @RequestMapping("/quick2")
    @ResponseBody //告知SpringMVC框架，不进行视图跳转 直接进行数据响应
    public String save2(){
        return"hello world!";
    }

    @RequestMapping(value = "/quick3", produces = "text/json; charset=utf-8")
    @ResponseBody //告知SpringMVC框架，不进行视图跳转 直接进行数据响应
    public String save3() throws IOException {
        User user = new User();
        user.setUsername("曾灿");
        user.setAge(18);
        //使用json的转换工具将对象转换成json格式字符串再返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping(value = "/quick4")
    @ResponseBody //告知SpringMVC框架，不进行视图跳转 直接 进行数据响应
    //让springmvc自动转换成json格式
    public User save4() throws IOException {
        User user = new User();
        user.setUsername("曾灿");
        user.setAge(18);
        return user;
    }

    //获取基本类型参数
    @RequestMapping(value = "/quick5")
    @ResponseBody //告知SpringMVC框架，不进行视图跳转 直接 进行数据响应
    //让springmvc自动转换成json格式
    public void save5(String username,Integer age) throws IOException {
        System.out.println(username);
        System.out.println(age);

    }

    //获取pojo类型参数
    @RequestMapping(value = "/quick6")
    @ResponseBody //告知SpringMVC框架，不进行视图跳转 直接 进行数据响应
    //让springmvc自动转换成json格式
    public void save6(User user) throws IOException {
        System.out.println(user);

    }

    //接受集合参数
    @RequestMapping(value = "/quick7")
    @ResponseBody //告知SpringMVC框架，不进行视图跳转 直接 进行数据响应
    //让springmvc自动转换成json格式
    public void save7(VO vo) throws IOException {
        System.out.println(vo);
    }

    //接受集合参数(ajax)
    @RequestMapping(value = "/quick8")
    @ResponseBody //告知SpringMVC框架，不进行视图跳转 直接 进行数据响应
    //让springmvc自动转换成json格式
    public void save8(@RequestBody List<User> userList) throws IOException {
        System.out.println(userList);
    }

    //参数绑定注解@RequestParam注解
    @RequestMapping(value = "/quick9")
    @ResponseBody //告知SpringMVC框架，不进行视图跳转 直接 进行数据响应
    //让springmvc自动转换成json格式
    public void save9(@RequestParam("name") String username) throws IOException {
        System.out.println(username);
    }

    //获得REstful风格的参数
    @RequestMapping(value = "/quick10/{username}")
    @ResponseBody //告知SpringMVC框架，不进行视图跳转 直接 进行数据响应
    //让springmvc自动转换成json格式
    public void save10(@PathVariable(value = "username") String username) throws IOException {
        System.out.println(username);
    }
}

