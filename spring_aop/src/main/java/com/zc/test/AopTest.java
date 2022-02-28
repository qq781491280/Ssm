package com.zc.test;
import com.zc.aop.TargetInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        TargetInterface target = (TargetInterface) app.getBean("target");
        target.save();          
    }
}
