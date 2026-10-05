package com.learning.designpatterns.creational.factory;

public class UpiPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}
