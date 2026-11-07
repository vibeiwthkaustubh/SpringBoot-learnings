package org.example;

import org.springframework.stereotype.Component;

@Component
public class PaymentService_lifecycle {

    public PaymentService_lifecycle() {
        System.out.println("Payment was created");
    }

    public void pay(){

        System.out.println("Payment is done");
    }
}
