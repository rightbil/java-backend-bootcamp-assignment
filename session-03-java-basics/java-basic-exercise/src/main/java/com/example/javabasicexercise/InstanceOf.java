package io.javabrains.javabasics;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {10, "Hello", true, 20.5};

        // Challenge: Use instanceof to determine the type of each object in the array
        for (Object value : objects) {
            if (value instanceof Integer) {
                System.out.println(value + " is type of " + value.getClass());
            } else if (value instanceof String) {
                System.out.println(value + " is type of " + value.getClass());
            } else if (value instanceof Boolean) {
                System.out.println(value + " is type of " + value.getClass());
            } else if (value instanceof Double) {
                System.out.println(value + " is type of " + value.getClass());
            } else System.out.println("type was not considered");
        }

    }
}
