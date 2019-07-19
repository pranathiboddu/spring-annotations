package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //used @component to create a bean for Movie
public class Movie {
    @Autowired
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display()  //calling actor class method
    {
        actor.displayActorInfo();
    }
}
