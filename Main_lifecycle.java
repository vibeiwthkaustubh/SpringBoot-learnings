package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_lifecycle {
    static void main() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig_lifecycle.class);
        School_lifecycle o1 = context.getBean(School_lifecycle.class);
        for(int x : o1.arr){
            System.out.println(x);
        }
        context.close();
    }
}
