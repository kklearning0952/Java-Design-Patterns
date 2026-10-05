package com.learning.designpatterns.creational.factory;

public class CardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment using Card");
    }
}
