package org.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class CartService_lifecycle implements InitializingBean { // using initializing bean we performed Initialization callback

    int arr[];

    public CartService_lifecycle(){
        System.out.println("Constructor called of CartService");
        arr = new int[10];
    }
    public void addtocart(){
        System.out.println("added to cart");
    }


    @Override    // this is a callback method that spring calls after object creation itself and before we can use it.
    public void afterPropertiesSet() throws Exception {
        for(int i = 0; i<10 ; i++){
            int a = 90;
            arr[i] = a++;
        }
    }
}
