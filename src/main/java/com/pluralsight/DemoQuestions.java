package com.pluralsight;

import static java.lang.System.*;

public class DemoQuestions {

    public static void main(String[] args) {
        // examples of the weirdness with pre and post increment
        int num1 = 10;
        int num2 = 20;
        out.println(num1 = num1 + 1);

        //explicitly increment by more than
        out.println(num1 += 3);

        //increment by one but it wont happen before the print line
        out.println(num1++);

        //increment by one but it will happen before the print line
        out.println(++num1);

        // examples of the Math class and its methods
        // Random gives you a random number between 1 and 0
        out.println(Math.random());

        if (Math.random() < 5) {
            out.println("50% chance I made it in the if");
        } else {
            out.println("50% chance I made it in the else");
        }

        //I want a cooler way to flip a coin so here is the flip coin method
            //long way
        if(Math.random() < 0.5) {
            out.println("Tails");
        } else {
            out.println("Heads");
        }
        }


}

