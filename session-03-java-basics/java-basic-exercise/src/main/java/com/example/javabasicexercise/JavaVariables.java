package io.javabrains.javabasics;
public class JavaVariables {
    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int speedPerHours = 60;
        // long variable to store a long value
        long cityDistance = 45698L;
        // float variable to store a floating-point value
        float keepPoints = 345.890f;
        // double variable to store a double value
        double interestRate = 8.5;
        // char variable to store a single character
        char nameStartsWith = 'B';
        // boolean variable to store a boolean value
        boolean attendBootcamp = true;
        // String variable to store a string of characters
        String myFistBabyName = "Aaron Bililign";
        // Step 2: Print the values of the variables to the console
        System.out.println("myFistBabyName = " + myFistBabyName);
        System.out.println("attendBootcamp = " + attendBootcamp);
        System.out.println("nameStartsWith = " + nameStartsWith);
        System.out.println("interestRate = " + interestRate);
        System.out.println("keepPoints = " + keepPoints);
        System.out.println("cityDistance = " + cityDistance);
        System.out.println("speedPerHours = " + speedPerHours);
        // Step 3: Modify the values of the variables and print the updated values
        if(attendBootcamp) attendBootcamp = !attendBootcamp;
        nameStartsWith = 'A';
        interestRate = ++interestRate;
        System.out.println("attendBootcamp = " + attendBootcamp);
        System.out.println("nameStartsWith = " + nameStartsWith);
        System.out.println("interestRate = " + interestRate);

    }
}