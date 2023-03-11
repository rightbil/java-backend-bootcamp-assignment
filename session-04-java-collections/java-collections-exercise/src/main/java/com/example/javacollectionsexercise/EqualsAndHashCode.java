package com.example.javacollectionsexercise;

/*
Generate a Person class with the member variables firstName, lastName,age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName,lastName, age
Compare two instances of Person that have the same data
*/
import java.util.Date;
import java.util.Objects;
class Residence {
    protected String streetName;
    protected int size;
    public Residence(String streetName, int size) {
        this.streetName = streetName;
        this.size = size;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Residence residence)) return false;
        return size == residence.size && Objects.equals(streetName, residence.streetName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(streetName, size);
    }
}
class Apartment extends Residence {
    private int floor;
    private int number;
    private Date residentSince;
    public Apartment(String streetName, int size, int floor, int number) {
        super(streetName, size);
        this.floor = floor;
        this.number = number;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartment apartment)) return false;
        return getFloor() == apartment.getFloor() && getNumber() == apartment.getNumber();
    }
    @Override
    public int hashCode() {
        return Objects.hash(floor,number);
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Date lastModifiedDate;
    private Apartment apartment;
    public Person(String firstName, String lastName, int age, Apartment apartment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.apartment = apartment;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(apartment, person.apartment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, apartment);
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", apartment=" + apartment +
                '}';
    }
    public Apartment getAddress() {
        return apartment;
    }
    public void setAddress(Apartment apartment) {
        this.apartment = apartment;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}
public class EqualsAndHashCode {
    public static void main(String[] args) {
        System.out.println("session-04-java-collections ........");
        Apartment apartment1 = new Apartment("11548 Stewart Avenue", 10, 1, 90);
        Person p1 = new Person("Bililign", "Gebru", 42, apartment1);
        Apartment apartment2 = new Apartment("11548 Stewart Avenue", 10, 1, 90);
        Person p2 = new Person("Bililign", "Gebru", 42, apartment2);
        Person p3 = null;
        System.out.println(p1);
        boolean check = p1 == p2;
        System.out.println("reference check with == " + check);
        System.out.println("content check with equals " + p1.equals(p2));
        System.out.println(p1.equals(p2));
        System.out.println("null checking " + p1.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}