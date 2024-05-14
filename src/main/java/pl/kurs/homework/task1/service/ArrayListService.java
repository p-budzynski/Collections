package pl.kurs.homework.task1.service;

import java.util.ArrayList;

public class ArrayListService {

    public <E> void replaceThirdElement(ArrayList<E> list, E newElement) {
        if (list.size() >= 3) {
            list.set(2, newElement);
        } else {
            System.out.println("ArrayList doesn't have enough elements to replace the third element.");
        }
    }

    public <E> void increaseList(ArrayList<E> list, int additionalSize) {
        list.ensureCapacity(list.size() + additionalSize);
    }

    public <E> void trimList(ArrayList<E> list) {
        list.trimToSize();
    }

    public <E> void clearList(ArrayList<E> list) {
        list.clear();
    }
}
