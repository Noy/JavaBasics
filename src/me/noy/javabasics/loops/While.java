package me.noy.javabasics.loops;

public class While {

	/*
	 * This is the While loop
	 */

    public static void main(String[] args) { // Void means it's going to do something but not return any data.
        Integer count = 0; // Defining the number, linking it to a variable which is, for now, equal to 0

        while (count <= 10) { // Seeing if the variable 'count' is less than 10, if so:
            System.out.println(count); // Print out what the number is. would go on forever as it's a loop.
            count++; // Means going up by one, so it doesn't go forever.
        }
    }
}
