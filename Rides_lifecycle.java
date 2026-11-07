package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Rides_lifecycle {
 int arr[];

    public Rides_lifecycle() {
        System.out.println("Rides constructor called");
        arr =new int[10];
    }

    @PostConstruct
    void setValue(){
        for(int i = 0 ; i<10 ; i++){
            arr[i] = 10;
        }


    }
}
