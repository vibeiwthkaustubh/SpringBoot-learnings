package org.example;

import jakarta.annotation.PreDestroy;

// Initialization callback acheieved through  inti method look AppConfig.
public class School_lifecycle {
    int arr[];

    public School_lifecycle() {
        System.out.println("School constructor called");
        arr = new int[10];
    }

    void setValue(){
       for(int i = 0 ; i<10 ; i++){
           arr[i] = 10;
       }
    }

    @PreDestroy
    void clean(){
        arr=null;

        try {
            for(int i = 0 ; i<2 ; i++){
                arr[i] =  20;
            }
        } catch (RuntimeException e) {
            System.out.println("yes the pre destroy works");
        }

    }


}
