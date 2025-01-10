package com.codedifferently.lab.calc3;

public class CalculatorTest3 {
    public static void main(String[] args) {

        Calculator3 calc = new Calculator3();

        //Use the Calculator object and arguments supplied to findTotal()
        //to print the total for each person
        calc.findTotal(10, "Jeff" );
        calc.findTotal(12, " Kianna");
        calc.findTotal(9, "Helen");

        calc.findTotal(8, "Ann");

        calc.findTotal(7, "Trisha");

        calc.findTotal(15, "Anh");

        calc.findTotal(12, "Eniola");

        calc.findTotal(30, "Ivy");






       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }
}
