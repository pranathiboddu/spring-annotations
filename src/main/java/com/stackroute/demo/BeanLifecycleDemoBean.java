package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean//implemented initializingbean and disposablebean
{


    public void afterPropertiesSet() throws Exception {

        System.out.println(" after property set:" );

    }

    public void destroy() throws Exception {

        System.out.println("destroyed");

    }
    public void customInit() //initialized custom init
    {
        System.out.println("Inside BeanLifeCycleDemoBean: customInit()");
    }

    public void customDestroy() // initialized custom destroy
    {
        System.out.println("Inside BeanLifeCycleDemoBean:  customDestroy()");
    }


}
