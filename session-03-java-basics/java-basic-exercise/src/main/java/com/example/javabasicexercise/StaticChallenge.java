package com.example.javabasicexercise;
/*
Create a class `Rectangle` with the following attributes:
`width`, `height`, and a static variable `numOfRectangles`
which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as
arguments and sets the values of the `width` and `height`
instance variables.
2.  Create a method `getArea` that calculates and returns
the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns
the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value
of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects,
calculate and print their area and perimeter, and finally print
the number of rectangles created without keeping count in this class.
 */
class Rectangle {
    private static int numberOfRectangles=0;
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.numberOfRectangles++;
    }
    public int getArea() {
        return width * height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getPerimeter() {
        return 2 * (width + height);
    }
    public static int getNumberOfRectangles() {
        return numberOfRectangles;
    }
}
public class StaticChallenge {
    public static void main(String[] args) {
        var r1 = new Rectangle(1, 2);
        System.out.println("Area : " + r1.getArea());
        System.out.println("Perimeter : "+ r1.getPerimeter());
        var r2 = new Rectangle(2, 4);
        System.out.println("Area : " + r2.getArea());
        System.out.println("Perimeter : "+ r2.getPerimeter());
        var r3 = new Rectangle(3, 6);
        System.out.println("Area : " + r3.getArea());
        System.out.println("Perimeter : "+ r3.getPerimeter());
        var r4 = new Rectangle(4, 8);
        System.out.println("Area : " + r4.getArea());
        System.out.println("Perimeter : "+ r4.getPerimeter());
        var r5 = new Rectangle(5, 10);
        System.out.println("Area : " + r5.getArea());
        System.out.println("Perimeter : "+ r5.getPerimeter());
        System.out.println(Rectangle.getNumberOfRectangles());
    }
}