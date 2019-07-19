package com.stackroute.domain;


import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.*;


@Configuration //used configuration
@ComponentScan(basePackages="com.stackroute.domain") //component scan for scanning packages
//@PropertySource("classpath:actorinfo.properties") //path for properties info
public class MovieConfiguration {
    //created bean u=object for beanlifecycledemobean class
    @Bean(name = "beanlifecycledemobean",initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean getBeanLifeCycleDemoBean(){
        return new BeanLifecycleDemoBean();
    }


}
