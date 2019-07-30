
package com.stackRoute;
import com.stackRoute.domain.Movie;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
    public static void main( String[] args )
    {

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
//
        Movie movie = applicationContext.getBean("movie", Movie.class);
        System.out.println(movie);
        applicationContext.close();

    }
}