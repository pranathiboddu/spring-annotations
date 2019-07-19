package com.stackroute.domain;


import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.annotation.*;


@Configuration //used configuration
@ComponentScan(basePackages="com.stackroute.domain") //component scan for scanning packages
//@PropertySource("classpath:actorinfo.properties") //path for properties info
public class MovieConfiguration {

   /* @Bean(name = "beanlifecycledemobean",initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean getBeanLifeCycleDemoBean() {
        return new BeanLifecycleDemoBean();
*/
   //created bean object for beanpostprocessor
        @Bean(name = "beanpostprocessordemo",initMethod = "initBean" ,destroyMethod = "destroyBean")
        public BeanPostProcessorDemoBean getBeanPostProcessorDemoBean()
        {
            return new BeanPostProcessorDemoBean();
        }
    }


