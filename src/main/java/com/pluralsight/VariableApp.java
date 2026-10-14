package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {

        // Declare a variable for each given question
        //Declare variable to store your favorite color
        String favoriteColor = "Red";
        //Declare a variable to store the year you started this class
        int startYear = 2026;
        // Declare a variable to store your middle name
        char middleInitial = 'I';
        // Declare a variable to store whether you have pets (yes/no)
        boolean havePets = false;
        // Declare a variable with a nice message or saying
        String niceMessage = "You're Awesome";

        // Print out declared variables onto console
        System.out.println(startYear);
        System.out.println(middleInitial);
        System.out.println(havePets);
        System.out.println(niceMessage);
        System.out.println(favoriteColor);

        //Declare and Initialize Variables
        // The numbers of days in the week
        int daysWeek = 7;
        //The price of coffee
        double coffeePrice = 4.99;
        // Your favorite letter
        char favoriteLetter = 'T';
        // Whether it's raining
        Boolean ifRaining = false;

        //Print out all values in complete sentences
        System.out.println("There are" + ' ' + daysWeek + ' ' + "days in a week" + "." );
        System.out.println("The price of Black Coffee is" + ' ' + coffeePrice + ".");
        System.out.println("My favorite letter is" + ' ' + favoriteLetter + ".");
        System.out.println(ifRaining);
    }
}