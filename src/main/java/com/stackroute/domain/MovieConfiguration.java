package com.stackroute.domain;


import org.springframework.context.annotation.*;


@Configuration //used configuration
@ComponentScan(basePackages="com.stackroute.domain") //component scan for scanning packages
@PropertySource("classpath:actorinfo.properties") //path for properties info
public class MovieConfiguration {


}
