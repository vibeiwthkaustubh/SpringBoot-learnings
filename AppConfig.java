package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan // we can either specify the package here @ComponentScan("package.name") or leave it if all the components resides in the same class
// Spring also creates the object of this AppConfig class in order to access the elements of it .
public class AppConfig {
}
