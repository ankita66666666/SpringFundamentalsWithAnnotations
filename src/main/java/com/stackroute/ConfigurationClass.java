package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.*;

@Configuration
public class ConfigurationClass {

    @Bean
    public Actor actor() {
        Actor actor = new Actor();
        actor.setAge(45);
        actor.setGender("Male");
        actor.setName("Salmankhan");
        return actor;
    }

    @Bean
    public Movie movie() {
        Movie movie = new Movie(actor());
        return movie;
    }
}