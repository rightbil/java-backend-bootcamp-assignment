package com.example.javacollectionsexercise;

/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:

1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/
import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.Scanner;
public class ListHomework {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        int input;
        char exitCode = 'y';
        do {
            System.out.print("\u001b[2J");
            System.out.println("press 1 : Add an element to the list");
            System.out.println("press 2 : Remove an element from the list");
            System.out.println("press 3 : Find the minimum element in the list");
            System.out.println("press 4 : Find the maximum element in the list");
            System.out.println("press 5 : Print the contents of the list");
            System.out.println("press 6 : Quit the program\n type here ==>");
            System.out.print("\033[H\033[2J");
            System.out.flush();
            int choise = userInput.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Enter the number to add to the list");
                    input = userInput.nextInt();
                    integerList.add(input);
                    break;
                case 2:
                    System.out.println("Enter the number to remove from list");
                    input = userInput.nextInt();
                    if (integerList.contains(integerList)) {
                        integerList.remove(input);
                    } else {
                        System.out.println("index out of bound");
                    }
                    break;
                case 3:
                    System.out.println(findMinumum(integerList));
                    break;
                case 4:
                    System.out.println(findMaximum(integerList));
                    break;
                case 5:
                    System.out.println("Printing all the contents");
                    System.out.println(integerList);
                    break;
                case 6:
                    System.out.println("Good day");
                    break;
                case default:
                    System.out.println(choise + " is wrong chose");

            }
            System.out.println("do you want to continue (y/n)?");
            exitCode = userInput.next().charAt(0);
        } while (exitCode != 'n');

    }
    private static OptionalInt findMaximum(ArrayList<Integer> l) {
        OptionalInt max = l.stream().mapToInt(x -> x).max();
        return max;
    }
    private static OptionalInt findMinumum(ArrayList<Integer> l) {
        OptionalInt min = l.stream().mapToInt(x -> x).min();
        return min;
    }

}