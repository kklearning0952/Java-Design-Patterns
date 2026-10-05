package com.learning.designpatterns.creational.factory;

public class FactoryPatternExample {

    public static void main(String[] args) {


        Payment payment1 = PaymentFactory.getPayment("UPI");
        payment1.pay();

        Payment payment2 = PaymentFactory.getPayment("CARD");
        payment2.pay();

        Payment payment3 = PaymentFactory.getPayment("NETBANKING");
        payment3.pay();

        //Not supported Payment
        Payment payment = PaymentFactory.getPayment("UPILITE");
    }
}
