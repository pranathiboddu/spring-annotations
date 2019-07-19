package com.stackroute.domain;


import org.springframework.context.annotation.*;


@Configuration //used configuration
@ComponentScan(basePackages="com.stackroute.domain") //component scan for scanning packages
//@PropertySource("classpath:actorinfo.properties") //path for properties info
public class MovieConfiguration {

    @Bean("actor") //created a bean object using @Bean for actor class
    public Actor actor1() {
        Actor actor = new Actor("Shahid Kapoor", "male", 35);
        return actor;
    }

    @Bean("movie1")//created a bean object using @Bean for movie class
    @Scope(value="prototype")
    public Movie movie1() {
        return new Movie(actor1());
    }

    @Bean("actor2")
    public Actor actor2() {
        Actor actor = new Actor("Deepika", "female", 35);
        return actor;
    }

    @Bean("movie2")
    public Movie movie2() {
        return new Movie(actor2());
    }

}
