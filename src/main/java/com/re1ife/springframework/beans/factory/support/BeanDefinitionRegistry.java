package com.re1ife.springframework.beans.factory.support;

import com.re1ife.springframework.beans.factory.config.BeanDefinition;

/**
 * @author JustACP
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表注册BeanDefinition
     * 
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
    
}
