package org.example;

import org.example.config.RootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext app= new AnnotationConfigApplicationContext(RootConfiguration.class);
        Application application= app.getBean ("application",Application.class);
        application.start();
    }
}
