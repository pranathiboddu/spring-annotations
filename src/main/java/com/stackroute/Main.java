package com.stackroute;
import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.SocketTimeoutException;


public class Main {
    public static void main(String[] args) {
        //using application context
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MovieConfiguration.class);
        Movie movie1 = annotationConfigApplicationContext.getBean("movie1", Movie.class);
        movie1.display();
        Movie movie2 = annotationConfigApplicationContext.getBean("movie2", Movie.class);
        movie2.display();
        System.out.println(movie1==movie2);

    }
}
