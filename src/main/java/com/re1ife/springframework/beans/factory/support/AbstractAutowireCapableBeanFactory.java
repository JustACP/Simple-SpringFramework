package com.re1ife.springframework.beans.factory.support;

import com.re1ife.springframework.beans.BeansException;
import com.re1ife.springframework.beans.factory.config.BeanDefinition;

/**
 * @author JustACP
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        
        Object bean = null;
        try{
            bean = beanDefinition.getBeanClass().newInstance();

        }catch(InstantiationException | IllegalAccessException e){
            throw new BeansException("Instantiation of bean faild",e );
        }

        addSingleton(beanName, bean);
        return bean;
    }

    


}
