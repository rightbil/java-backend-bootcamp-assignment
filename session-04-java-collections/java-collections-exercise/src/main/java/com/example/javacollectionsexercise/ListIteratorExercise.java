package com.example.javacollectionsexercise;
/*
Print the list in forward and reverse order using iterators only
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ListIteratorExercise {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        items.add("Item 4");
        items.add("Item 5");
        Iterator<String> iterator = items.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        ListIterator<String> listIterator = items.listIterator();
        while (listIterator.hasNext()) {
            String nextWithIndex = items.get(listIterator.nextIndex());
            String next = listIterator.next();

        }
        while (listIterator.hasPrevious()) {
            String previousWithIndex
                    = items.get(listIterator.previousIndex());
            String previous = listIterator.previous();
            System.out.println(previous);
        }
    }
}