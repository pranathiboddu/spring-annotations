package com.stackroute.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {


    private String actorName;
    private String gender;
    int age;
    @Autowired
    @Value("${actor.actorName}")
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
    @Autowired
    @Value("${actor.gender}")
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Autowired
    @Value("${actor.age}")
    public void setAge(int age) {
        this.age = age;
    }
    public void displayActorInfo() {
        System.out.println("Actor name :" + actorName + " Gender:" + gender + " Age:" + age);
    }
}

