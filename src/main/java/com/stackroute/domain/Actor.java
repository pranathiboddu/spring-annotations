package com.stackroute.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //decalred component to create a bean
public class Actor {


    private String actorName;
    private String gender;
    private int age;

    @Autowired //used annotation autowire
    public Actor(String actorName,String gender,int age)
    {
        this.actorName=actorName;
        this.gender=gender;
        this.age=age;
    }

    public void displayActorInfo() {
        System.out.println("Actor name :" + actorName + " Gender:" + gender + " Age:" + age);
    }
}

