package me.noy.javabasics;

import java.util.EnumSet;

public class EnumExample2 {


    /*
      This is our follow up class!
     */

    public static void main(String[] args) {
        // We will start with our enhanced for loop. (Go to me.noy.javabasics.loops.EnhancedForLoop for more info)
        for (EnumExample e : EnumExample.values()) { // We loop through all our values of constants.
            System.out.printf("%s\t%s\t%s\n", e, e.getAge(), e.getGender()); // We print our the Name, Age and Gender of the person in our desired format.
        }

        // This is a way to choose which constants you would like to print individually.
        for (EnumExample enumExample : EnumSet.range(EnumExample.JACK, EnumExample.JILL)) { // You loop through only your desired ones.
            System.out.printf("%s\t%s\t%s\n", enumExample, enumExample.getAge(), enumExample.getGender()); // Print in our desired format.
        }
    }
}
