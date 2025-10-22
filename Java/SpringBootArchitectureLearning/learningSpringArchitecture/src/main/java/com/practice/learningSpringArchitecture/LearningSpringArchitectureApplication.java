package com.practice.learningSpringArchitecture;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringArchitectureApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringArchitectureApplication.class, args);
    }

    private paymentRazorPay payer;
    public LearningSpringArchitectureApplication(paymentRazorPay payer){
        this.payer=payer;
    }
    public void run(String... args) throws Exception {
        String result = payer.pay();
        System.out.println("Payment attempt result: " + result);
    }
}
