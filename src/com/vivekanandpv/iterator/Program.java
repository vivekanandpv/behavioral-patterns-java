package com.vivekanandpv.iterator;

public class Program {
    public static void main(String[] args) {
        Sequence<String> listSequence = new SequenceList<>("Turing", "Church", "Curry", "Neumann");

        Iterator<String> iterator = listSequence.getIterator();

        while (!iterator.isDone()) {
            System.out.println(iterator.getCurrentItem());
            iterator.next();
        }
    }
}
