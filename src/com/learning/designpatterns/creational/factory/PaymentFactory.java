package com.learning.designpatterns.creational.factory;

public class PaymentFactory {

    public static Payment getPayment(String paymentType) {
        if (paymentType.equals("UPI")) {
            return new UpiPayment();
        }

        if (paymentType.equals("CARD")) {
            return new CardPayment();
        }

        if (paymentType.equals("NETBANKING")) {
            return new Netbanking();
        }

        throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
    }
}
