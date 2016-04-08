package me.noy.javabasics.loops;

public class DoWhile {

	/*
	 * Why do-while? <-- See what I did there? Why not just while?
	 * If you want to do something, in our case, print out the counter, at least once, use the do-while loop.
	 * If you want to test it and ONLY run it if the test is true, use the while loop.
	 */

    public static void main(String[] args) {
        Integer counter = 0;
        do { // Tell the code to do something.
            System.out.println(counter); // Prints the variable. This will always happen EVEN IF the loop is false.
            counter++; // Goes up by 1, otherwise it'll be an endless loop.
        }while(counter <= 10); // Saying while the variable counter, which is equal to 0, is less than or equal to 10. In this case, it's true, so it prints out the loop.
    }
}
