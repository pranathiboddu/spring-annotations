package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //declared component to create a bean for movie
public class Movie {
    @Autowired //used @autowire
    private Actor actor;

    public void display() {
        actor.displayActorInfo();
    }
}
