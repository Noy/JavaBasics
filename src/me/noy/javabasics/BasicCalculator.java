package me.noy.javabasics;

import java.util.Scanner;

/**
 * Created by Belfort on 4/7/2016.
 */
public class BasicCalculator {

    /*
        * This is a basic "1+1" calculator, it will allow you to add two numbers together.
     */

    public static void main(String[] args) { // Our main method
        Scanner scanner = new Scanner(System.in); // Our Scanner
        double firstNumber, secondNumber, answer; // Double means a number with decimal places, unlike an integer.
        System.out.println("Enter first number!");
        firstNumber = scanner.nextDouble();
        System.out.println("Enter secomd number!");
        secondNumber = scanner.nextDouble();
        answer = firstNumber + secondNumber; // Our logic. Making the first and the second number, equal our answer.
        System.out.println("Here is your answer: " + answer + "!");
    }
}
