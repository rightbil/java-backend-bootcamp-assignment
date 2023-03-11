
package com.example.javabasicexercise;


/*
1.  Create a class called `Car` with member variables for the make,
model, and year of the car.
2.  Create a constructor method for the `Car` class that initializes
the member variables.
3.  Create getter methods for the make, model, and year.
4.  Create a `toString` method that returns a string representation
of the car in the form "year make model".
5.  In the `main` method of this class, create a `Car` object with a
make, model, and year of your choice.
6.  Use the member variables and methods of the `Car` class to print
the make, model, and year of the car.
7.  The expected output of the program is:

```
Make: Toyota
Model: Camry
Year: 2020
Details: 2020 Toyota Camry
```

 */
class Car {
    public String make;
    public String model;
    public String year;
    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", "2020");
        System.out.println("Make : " + car.getMake());
        System.out.println("Model : " + car.getModel());
        System.out.println("Year : " + car.getYear());
        System.out.println("Details: " + car);

    }
}