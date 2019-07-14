package com.stackroute.domain;


import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages="com.stackroute.domain")
//@PropertySource("classpath:actorinfo.properties")
public class MovieConfiguration {

    @Bean("actor")
    public Actor actor1() {
        Actor actor = new Actor("Shahid Kapoor", "male", 35);
        return actor;
    }

    @Bean("movie1")
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