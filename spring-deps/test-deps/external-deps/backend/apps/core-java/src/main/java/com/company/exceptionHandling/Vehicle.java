package com.company.exceptionHandling;

public class Vehicle {

    public void getPrice() {
        System.out.println("Inside getPrice method of Vehicle");
        throw new IllegalArgumentException("Exception from Vehicle Class....");
    }
}

class Car extends Vehicle {

    @Override
    public void getPrice() {
        System.out.println("Inside getPrice method of Car");
        //throw new Exception("Exception from Car Class....");
        throw new IllegalArgumentException("Exception from Car Class....");
    }

}