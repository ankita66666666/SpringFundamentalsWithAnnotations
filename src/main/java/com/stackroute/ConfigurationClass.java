package com.stackroute;

import java.lang.String;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationClass {

//    @Bean
//    public Actor actor() {
//        Actor actor = new Actor();
//        actor.setAge(35);
//        actor.setGender("Male");
//        actor.setName("Salmankhan");
//        return actor;
//    }


    @Bean
    public Actor actorHritik() {
        Actor actor = new Actor("Hritik", "Male", 30);
        return actor;
    }


    @Bean
    public Actor actorSalman() {
        Actor actor = new Actor("Salmankhan", "Male", 45);
        return actor;

    }
        @Bean({"movieA", "movieB"})
        @Scope("prototype")
        public Movie movie () {
            Movie movie = new Movie(actorSalman());
            return movie;
        }
    }
