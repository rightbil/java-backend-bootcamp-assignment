package com.example.javacollectionsexercise;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/*
Write code that calls the getFruits method
and then iterates over the collection,
printing each element to console
 */
public class IteratorExercise {
    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
       Iterator<String> iterator = fruitSupplier.getFruits().iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
class FruitSupplier {
    public Collection<String> getFruits() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}