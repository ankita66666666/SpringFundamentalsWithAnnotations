
package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    @Autowired
    private Actor actorSalmankhan;

    public Movie() {
        System.out.println("Injected through constructor");
    }

    public Movie(Actor actorSalmankhan) {

        this.actorSalmankhan = actorSalmankhan;
    }

//    @Autowired
//    public void setActorDiljit(Actor actorDiljit) {
//        System.out.println("Injected through setter");
//        this.actorDiljit = actorDiljit;
//    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actorSalmankhan +
                '}';
    }
}