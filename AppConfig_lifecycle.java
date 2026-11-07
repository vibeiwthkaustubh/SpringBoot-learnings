package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class AppConfig_lifecycle {

    @Bean(initMethod = "setValue")
    public School_lifecycle m1(){
       return new School_lifecycle();
    }
}
