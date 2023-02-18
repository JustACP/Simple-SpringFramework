package com.re1ife.springframework.test;

import org.junit.Test;

import com.re1ife.springframework.BeanDefinition;
import com.re1ife.springframework.BeanFactory;
import com.re1ife.springframework.test.Bean.UserService;

/**
 * @author JustACP
 */

public class ApiTest {
    @Test
    public void test_BeanFactory(){
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.querUserInfo();
    }    
}
