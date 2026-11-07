package org.example;

//@Component
public class OrderService_lifecycle {
    private PaymentService_lifecycle p1;


    public OrderService_lifecycle(PaymentService_lifecycle p1) {
        System.out.println("order was created");
        this.p1 = p1;
    }

    public void placeOrder(){
        System.out.println("Order is being placed");
        p1.pay();
    }
}
