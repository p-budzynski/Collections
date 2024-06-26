package pl.kurs.homework.task4.service;

import java.util.TreeSet;

public class TreeSetService {

    public <E> E returnAndRemoveLastElement(TreeSet<E> treeSet) {
        if (treeSet.isEmpty()) {
            throw new IllegalStateException("TreeSet is empty.");
        }
        return treeSet.pollLast();
    }

    public <E> E returnLowerElement(TreeSet<E> treeSet, E element) {
        if (treeSet.isEmpty()) {
            throw new IllegalStateException("TreeSet is empty.");
        }
        return treeSet.lower(element);
    }
}
