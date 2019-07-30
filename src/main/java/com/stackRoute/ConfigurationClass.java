
package com.stackRoute;
import com.stackRoute.domain.Actor;
import com.stackRoute.domain.Movie;
import com.stackRoute.BeanLifeCycleDemo;
import com.stackRoute.domain.Movie;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.stackRoute.domain")
@PropertySource("Actor.properties")
public class ConfigurationClass {

    @Bean
    public Movie movie(){
        Movie movie=new Movie();
        return movie;
    }
    @Bean(name = "lifeCycle")
    public BeanLifeCycleDemo beanLifeCycleDemo(){
        BeanLifeCycleDemo beanLifeCycleDemo=new BeanLifeCycleDemo();
        return beanLifeCycleDemo;
    }

}