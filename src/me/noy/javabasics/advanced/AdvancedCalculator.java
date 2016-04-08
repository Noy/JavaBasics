package me.noy.javabasics.advanced;

import java.util.Scanner;

/**
 * @author Noy Hillel, give credit Nick.
 * Kidding, love you.
 */
public final class AdvancedCalculator {

    static {
        Generics.print("Welcome to the calculator!");
    }

    /**
     * Main method
     * @param args ignored
     */
    public static void main(String[] args) {
        while (true) {
            try {
                calculate();
            }catch (RuntimeException e) {
                Generics.print("Thanks for using the calculator!");
                break;
            }
        }
    }

    /**
     * This is the method which actually lets us perform the calculations. It's private as we do not
     have to use it in any other class and static so we do not have to create an instance of this class in our main method.
     */
    private static void calculate() {
        // Creating our scanner variable.
        Scanner scanner = new Scanner(System.in);
        // Print a message, of course using our method we created in the "Generics.java" class
        Generics.print("Please type an equation, or type exit to leave");
        // Creating a string input so we'll be able to leave the calculator.
        String s = scanner.nextLine();
        // If the 's' variable is either of these, throw the RuntimeException, AKA leave.
        if (s.equalsIgnoreCase("exit") || s.equalsIgnoreCase("leave")) throw new RuntimeException();
        // Calculations is null, for now.
        Calculations c = null;
        // An array of Strings is null, for now.
        String[] numbers = null;
        // Our enhanced for loop, looping through all the possible calculations
        for (Calculations calculations : Calculations.values()) {
            // If the String contains either "+, -, / or *" split the numbers and recognise it as a key.
            if (s.contains(calculations.calculationKey)) {
                numbers = s.split("\\" + calculations.calculationKey);
                if (numbers.length != 2) {
                    numbers = null;
                    break;
                }
                // Making our Enum equal loop outcome.
                c = calculations;
            }
        }
        // If null, print error message. E.g. if they person types "Hello" or just one number
        if (c == null || numbers == null) {
            Generics.print("You didn't specify an operation!");
            // Restart
            calculate();
            return;
        }
        try {
            // Creating our variable for X and Y (Our two numbers)
            Double x = Double.valueOf(numbers[0]);
            Double y = Double.valueOf(numbers[1]);
            // Print the calculation!
            Generics.print(s + " = " + c.delegate.performCalculation(x, y));
        }catch (NumberFormatException e) {
            // Not typing a number
            Generics.print("You didn't type a number.");
        }
    }

    // Our Enum
    private enum Calculations {
        ADD((CalcDelegate) (x, y) -> x+y, "+"),
        SUBTRACT((CalcDelegate) (x,y) -> x-y, "-"),
        DIVIDE((CalcDelegate) (x,y) -> x/y, "/"),
        MULTIPLY((CalcDelegate) (x,y) -> x*y, "*");

        private final CalcDelegate delegate;
        private final String calculationKey;

        Calculations(CalcDelegate delegate, String calcuation) {
            this.delegate = delegate;
            this.calculationKey = calcuation;
        }
    }

    // Our interface
    private interface CalcDelegate { double performCalculation(Double x, Double y) throws ArithmeticException; }
}