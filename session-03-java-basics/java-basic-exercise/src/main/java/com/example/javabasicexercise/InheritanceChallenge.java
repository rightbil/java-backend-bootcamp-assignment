package io.javabrains.javabasics;

/*

1.  Create an `Animal` class with member variables for the name and age
of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member
variable for the breed of the dog and a constructor method that
initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print
"The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member
 variable for the number of lives of the cat and a constructor method
 that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print
"The cat meows".
6.  In the `main` method of this class, create an array of `Animal`
objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another
`Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age,
and sound of each animal.
 */
import java.util.List;
class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String makeSound() {
        return new String("All Animals make sound");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Dog extends Animal {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    public String makeSound() {
        return new String("The Dog barks");
    }
    public String getBreed() {
        return breed;
    }
}
class Cat extends Animal {
    private int numberOfLikes;
    public Cat(String name, int age, int numberOfLikes) {
        super(name, age);
        this.numberOfLikes = numberOfLikes;
    }
    @Override
    public String makeSound() {
        return new String("The cat meows");
    }
    public int getNumberOfLikes() {
        return numberOfLikes;
    }
}
public class InheritanceChallenge {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Animal("Lion", 50);
        animal[1] = new Dog("Shasho", 13, "African");
        animal[2] = new Cat("kitty", 5, 20000);
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].getName() + " " + animal[i].getAge() + " " + animal[i].makeSound());
        }
    }
}