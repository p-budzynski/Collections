package pl.kurs.homework.task4.service;

import java.util.TreeSet;

public class TreeSetService<E> {

    public E returnAndRemoveLastElement(TreeSet<E> treeSet) {
        if (treeSet.isEmpty()) {
            throw new IllegalStateException("TreeSet is empty.");
        }
        E lastElement = treeSet.last();
        treeSet.remove(lastElement);
        return lastElement;
    }

    public E returnLowerElement(TreeSet<E> treeSet, E element) {
        if (treeSet.isEmpty()) {
            throw new IllegalStateException("TreeSet is empty.");
        }
        return treeSet.lower(element);
    }
}
