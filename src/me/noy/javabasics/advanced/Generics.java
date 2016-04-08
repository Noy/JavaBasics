package me.noy.javabasics.advanced;

class Generics {
    /**
     * Generics are a type or method to operate on objects of various types while providing compile-time type safety.
     * What this means is, generic methods and generic classes enable programmers to specify, with a single method
       declaration, a set of related methods or, with a single class declaration, a set of related types, respectively.
     */

    // This is our Generic-Type Print method
    @SafeVarargs
    static <T> void print(T... args) { // No access modifier as we're only using it in this package.
        for (T arguments : args) { // Our enhanced for loop, looping through all the arguments a person may provide.
            System.out.println(arguments); // Printing it out.
        }
    }
}