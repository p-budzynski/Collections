package pl.kurs.homework.task1.service;

import java.util.ArrayList;
import java.util.List;

public class ArrayListService<E> {

    public void replaceThirdElement(ArrayList<E> list, E newElement) {
        if (list.size() >= 3) {
            list.set(2, newElement);
        } else {
            System.out.println("ArrayList doesn't have enough elements to replace the third element.");
        }
    }

    public void increaseList(ArrayList<E> list, int additionalSize) {
        list.ensureCapacity(list.size() + additionalSize);
    }

    public void trimList(ArrayList<E> list) {
        list.trimToSize();
    }

    public void clearList(ArrayList<E> list) {
        list.clear();
    }
}
