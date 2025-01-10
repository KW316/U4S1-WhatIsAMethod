package com.codedifferently.lab.calc4;

public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();
        calc.free = 15.0/6.0;
        calc.moocher = 30.0/6.0;
        double total = 0;
        //Name your friends
        calc.findTotal(10, "Kianna");
        calc.findTotal(12, "Helen");
        calc.findTotal(9,  "Ivy");
        calc.findTotal(8,  "Anh");
        calc.findTotal(7,  "Ann");
 
        calc.findTotal(11, "Arya");

        total = calc.getPrice(10) + calc.getPrice(12) + calc.getPrice(9) + calc.getPrice(8) + calc.getPrice(7) + calc.getPrice(15);
        System.out.println(total);
        //Find and print the entire table's total, including tax and tip

    }
}
