package me.noy.javabasics.loops;

public class EnhancedForLoop {

    /*
      * This is an enhanced for loop.
      * It contains:
      *      First it takes the type and the identifier (variable you want to store it in)
      *      Second what Array you want to loop through. (Has to be an array of some sort)
     */

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5}; // Creating the Array Initialiser
        Integer total = 0; // Total, Defaults/Starts at 0.

        for (Integer x : integerArray) { //Enhanced For Statement
            total += x; // Add each number in the array, each time it loops (which is once).
        }
        System.out.println(total);
    }
}