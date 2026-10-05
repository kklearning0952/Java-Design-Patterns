package com.learning.designpatterns.creational.factory;

public class Netbanking implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment using NETBANKING");
    }
}
