package com.codedifferently.lab.calc2;

public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;

    public void findTotal(){
       double total = originalPrice + (originalPrice*.05) + (originalPrice*.15);
        System.out.println(total);
        //Calculate an individual's total after tax and tip
        //Print this value
    }
}
