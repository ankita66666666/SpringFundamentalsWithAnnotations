package com.stackRoute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor extends Movie{


    private String name;
    private String gender;
    private int age;

    public Actor(){}
    public Actor( String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    @Value("${actor.name}")
    public void setName(String name) {
        this.name = name;
    }

    @Value("${actor.gender}")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Value("${actor.age}")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}

