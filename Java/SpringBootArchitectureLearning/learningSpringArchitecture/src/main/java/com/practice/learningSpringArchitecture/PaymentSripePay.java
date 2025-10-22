package com.practice.learningSpringArchitecture;

import org.springframework.stereotype.Component;

@Component
public class PaymentStripePay implements PaymentService{
    public String pay(){
        System.out.println("hello i have payed 2000 but this time through Stripe");
        return "Hello i have payed 2000 but this time through Stripe";
    }
}
