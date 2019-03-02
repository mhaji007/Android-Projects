package com.example.javapractice;

public class CarSimulator {

    public static void main(String[] args) {
        System.out.println("Hello there!");

        Car myToyota = new Car();

        System.out.println("The car color is " + myToyota.color);

        myToyota.color = "blue";

        System.out.println("The car color is " + myToyota.color);



    }
}
