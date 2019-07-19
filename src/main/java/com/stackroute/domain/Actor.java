package com.stackroute.domain;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //declared component
public class Actor {
//passed values to the literals using @value
    @Value("${actor.actorName}")
    private String actorName;

    @Value("${actor.gender}")
    private String gender;

    @Value("${actor.age}")
    int age;

    public void displayActorInfo() {
        System.out.println("Actor name :" + actorName + " Gender:" + gender + " Age:" + age);
    }
}

