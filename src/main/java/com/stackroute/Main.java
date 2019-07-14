package com.stackroute;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.SocketTimeoutException;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MovieConfiguration.class);
       /* Movie movie = annotationConfigApplicationContext.getBean("movie", Movie.class);
        movie.display();*/
       BeanPostProcessorDemoBean beanPostProcessorDemoBean=annotationConfigApplicationContext.getBean("beanpostprocessordemo", BeanPostProcessorDemoBean.class);
       beanPostProcessorDemoBean.initBean();
       beanPostProcessorDemoBean.destroyBean();


    }
}