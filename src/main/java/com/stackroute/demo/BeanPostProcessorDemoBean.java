package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor //implemented beanpostprocessor interface
{
//implemente method for beanpost processor
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("Inside BeanPostProcessorDemoBean: postProcessAfterInitialization for: "+beanName);
        return bean;

    }


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("Inside BeanPostProcessorDemoBean: postProcessBeforeInitialization for: "+beanName);
        return bean;

    }
    public void initBean() {
        System.out.println("Init Bean");
    }

    public void destroyBean() {
        System.out.println("Destroy bean");
    }
}
