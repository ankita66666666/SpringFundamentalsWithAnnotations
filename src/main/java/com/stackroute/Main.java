package com.stackroute;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);


        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie);
    }
}
