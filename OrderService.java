package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    // with the help of the field and setter injection circular dependency  can be resolved as now spring won't need the object of the another class for object creation
    private PaymentService p1;

//    public OrderService(PaymentService p1) {
//        this.p1 = p1;
//    }

    public void placeOrder(){
        p1.pay();
        getOrderDetails();
        System.out.println("Order placed ");
    }

    public void getOrderDetails(){
        System.out.println("Order details printed");
    }
}
