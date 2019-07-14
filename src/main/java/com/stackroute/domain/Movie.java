package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    private Actor actor;
    public Movie(Actor actor)
    {
        this.actor=actor;
    }

    public void display() {
        actor.displayActorInfo();
    }
}