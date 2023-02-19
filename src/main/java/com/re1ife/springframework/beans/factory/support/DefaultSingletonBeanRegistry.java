package com.re1ife.springframework.beans.factory.support;
/**
 * @author JustACP
 */

import com.re1ife.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry{

    private Map<String,Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName,Object singleObject){
        singletonObjects.put(beanName, singleObject);
    }

}
