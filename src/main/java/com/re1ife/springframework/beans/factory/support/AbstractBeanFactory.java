package com.re1ife.springframework.beans.factory.support;


import com.re1ife.springframework.beans.BeansException;
import com.re1ife.springframework.beans.factory.BeanFactory;
import com.re1ife.springframework.beans.factory.config.BeanDefinition;

/**
 * @author JustACP
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory{

    @Override
    public Object getBean(String beanName) {
        Object bean = getSingleton(beanName);
        if(bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
    
    
}
