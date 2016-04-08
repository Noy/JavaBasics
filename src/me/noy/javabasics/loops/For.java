package me.noy.javabasics.loops;

public class For {

	/*
	 * What is the 'for' loop? What does it contain?
	 * Contains 3 arguments.
	 * 1. First, where the loop starts.
	 * 2. Second, where the loop ends.
	 * 3. Third, How much do you want to increment it by?
	 */

    public static void main(String[] args) {
        Integer counter; // Creating our variable.
        for (counter = 1; counter <= 10; counter++) { // Loop starts at 1, ends at 10, going up by one at a time.
            System.out.println(counter); // Prints the loop.
        }

        // Another type of for loop.
        for (counter=6; counter <= 21;counter += 3) // Loop starts at 6, ends at 21, goes in steps of 3.
            System.out.println(counter); // Prints the loop.
    }
}
