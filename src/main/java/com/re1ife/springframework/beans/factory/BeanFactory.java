package com.re1ife.springframework.beans.factory;



/**
 * @Author JustACP
 */
public interface BeanFactory {

    
    /**
     * 获取Bean
     * @param beanName
     * @return Object
     */
    Object getBean(String beanName);
    
}
