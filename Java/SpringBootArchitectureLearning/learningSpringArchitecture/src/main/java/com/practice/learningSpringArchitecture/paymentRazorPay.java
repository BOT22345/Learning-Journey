package com.practice.learningSpringArchitecture;

import org.springframework.stereotype.Component;

//@Component
public class paymentRazorPay implements PaymentService{
    public String pay(){
        System.out.println("hello i have payed 2000");
        return "payed 2000";
    }
}
