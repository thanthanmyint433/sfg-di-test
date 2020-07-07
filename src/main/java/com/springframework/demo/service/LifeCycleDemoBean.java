package com.springframework.demo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){

    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Set the bean factory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("set the bean name");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("set the destroy bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("set properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Set application context");
    }
    @PostConstruct
    public void SetPostConstruct(){
        System.out.println("Post construct");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy===");
    }
    public void beforeInit() {
        System.out.println("Before init life cycle");
    }

    public void afterInit() {
        System.out.println("After init life cycle");
    }
}
