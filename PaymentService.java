package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

//    @Autowired
    // with the help of the field and setter injection circular dependency  can be resolved as now spring won't need the object of the another class for object creation
//    private OrderService o1;

//    public PaymentService(OrderService o1) {
//        this.o1 = o1;
//    }

    public void pay(){
        System.out.println("Payment done");

        // getOrderDetails is not the responsibility of the pay method
//        o1.getOrderDetails();
    }
}
