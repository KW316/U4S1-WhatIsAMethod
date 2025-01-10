package com.codedifferently.lab.tip;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        System.out.println("Person1: " + findTotal(10));
        System.out.println("Person2: " + findTotal(12));
        System.out.println("Person3: " + findTotal(9));
        System.out.println("Person4: " + findTotal(8));
        System.out.println("Person5: " + findTotal(7));
        System.out.println("Person6: " + findTotal(15));
        System.out.println("Person7: " + findTotal(11));
        System.out.println("Person8: " + findTotal(30));


    }
    public static Double findTotal(double a) {
        double total = a + (a*.05)+(a*.15);
        return total;
    }


}
