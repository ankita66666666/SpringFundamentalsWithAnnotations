package com.stackRoute;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {




        @PostConstruct
        public void Init() {
            System.out.println("Initialization");
        }

        public void clean() {
            System.out.println("custom destroy");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("Destroy");
        }

        public void afterPropertiesSet() throws Exception {
            System.out.println("After properties");
        }
    }

