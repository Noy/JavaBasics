package me.noy.javabasics;

import java.util.Scanner;

public class ScannerExample {

    /*
     * The Scanner class is a simple text scanner which can parse primitive types and strings using regular expression.
     */

    public static void main(String[] args) {
        System.out.println("Type something!");
        // Creating a new instance of the Scanner class, with the parameter System.in.
        Scanner scanner = new Scanner(System.in); // This makes us able to type out on the screen
        System.out.println("You just wrote the word(s) " + scanner.next());  // This prints out something on the screen
    }
}