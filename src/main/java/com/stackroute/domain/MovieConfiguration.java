package com.stackroute.domain;


import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages="com.stackroute.demo")
@PropertySource("classpath:actorinfo.properties")
public class MovieConfiguration {

    @Bean(name = "beanlifecycledemobean",initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean getBeanLifeCycleDemoBean(){
        return new BeanLifecycleDemoBean();
    }


}