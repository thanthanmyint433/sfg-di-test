package com.springframework.demo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
public Object postProcessBeforeInitialization(Object bean,String beanname)throws BeansException {

    if (bean instanceof LifeCycleDemoBean){
        ((LifeCycleDemoBean) bean).beforeInit();

    }
    return bean;
}
public Object postProcessAfterInitialization(Object bean,String beanname) throws BeansException{
    if (bean instanceof LifeCycleDemoBean){
        ((LifeCycleDemoBean) bean).afterInit();

    }
    return bean;
}
}
