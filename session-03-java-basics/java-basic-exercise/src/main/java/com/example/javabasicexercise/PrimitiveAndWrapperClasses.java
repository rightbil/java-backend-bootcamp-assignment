package com.example.javabasicexercise;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int p = 90;
        // Step 2: Convert primitive variables to wrapper objects
        Integer wrappedInt = p;
        // Step 3: Print the values of the wrapper objects
        System.out.println("wrappedInt = " + wrappedInt);
        // Step 4: Convert wrapper objects back to primitive variables
        p = (int) wrappedInt;
        // Step 5: Print the values of the primitive variables
        System.out.println("p = " + p);
    }
}