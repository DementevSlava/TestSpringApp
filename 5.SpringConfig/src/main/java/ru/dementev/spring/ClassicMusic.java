package ru.dementev.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class ClassicMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialisation");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungrian Phapsody";
    }
}
