package com.re1ife.springframework.beans.factory.config;

/**
 * @author JustACP
 */
public interface SingletonBeanRegistry {
    /**
     * 获取单例对象
     *
     * @param beanName bean名称
     * @return Object
     */
    Object getSingleton(String beanName);
}
