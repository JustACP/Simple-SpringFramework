package com.re1ife.springframework.test;

import javax.swing.DefaultFocusManager;

import org.junit.Test;

import com.re1ife.springframework.beans.factory.BeanFactory;
import com.re1ife.springframework.beans.factory.config.BeanDefinition;
import com.re1ife.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.re1ife.springframework.test.Bean.UserService;

/**
 * @author JustACP
 */

public class ApiTest {
    @Test
    public void test_BeanFactory(){
        //1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.注册
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.获取
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.querUserInfo();

        //4. 第二次获取
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.querUserInfo();
    }    
}
