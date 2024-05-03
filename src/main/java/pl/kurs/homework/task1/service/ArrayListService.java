package pl.kurs.homework.task1.service;

import java.util.ArrayList;
import java.util.List;

public class ArrayListService<E> {

    public void replaceThirdElement(List<E> list, E newElement) {
        if (list.size() >= 3) {
            list.remove(2);
            list.add(2, newElement);
        } else {
            System.out.println("ArrayList doesn't have enough elements to replace the third element.");
        }
    }

    public List<E> increaseList(List<E> list, int additionalSize) {
        List<E> newList = new ArrayList<>(list.size() + additionalSize);
        newList.addAll(list);
        return newList;
    }

    public List<E> trimList(List<E> list) {
        List<E> newList = new ArrayList<>(list.size());
        newList.addAll(list);
        return newList;
    }

    public void clearList(List<E> list) {
        while (!list.isEmpty()) {
            list.remove(0);
        }
    }

}
