package pl.kurs.homework.task3.service;

import java.util.HashSet;

public class HashSetService<E> {
    public HashSet<E> findCommonElements(HashSet<E> hashSetOne, HashSet<E> hashSetTwo) {
        HashSet<E> commonElements = new HashSet<>(hashSetOne);
        commonElements.retainAll(hashSetTwo);
        return commonElements;
    }

    public boolean containsAllElements(HashSet<E> hashSetOne, HashSet<E> hashSetTwo) {
        return hashSetOne.containsAll(hashSetTwo);
    }

}
