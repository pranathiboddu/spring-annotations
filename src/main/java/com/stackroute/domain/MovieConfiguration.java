package com.stackroute.domain;


import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages="com.stackroute.demo")
@PropertySource("classpath:actorinfo.properties")
public class MovieConfiguration {

   /* @Bean(name = "beanlifecycledemobean",initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean getBeanLifeCycleDemoBean() {
        return new BeanLifecycleDemoBean();
*/
        @Bean(name = "beanpostprocessordemo",initMethod = "initBean" ,destroyMethod = "destroyBean")
        public BeanPostProcessorDemoBean getBeanPostProcessorDemoBean()
        {
            return new BeanPostProcessorDemoBean();
        }
    }


