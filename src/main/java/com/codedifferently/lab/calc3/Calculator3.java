package com.codedifferently.lab.calc3;

public class Calculator3 {
    public double tax = .05;
    public double tip = .15;

    public void findTotal(double price, String a){
        double total = price*(1+tax+tip);
        System.out.println("This is " + a +"'s total $" +total);

    }
}
