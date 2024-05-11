package pl.kurs.homework.task2.service;

import java.util.LinkedList;

public class LinkedListService<E> {

    public void insertElement(LinkedList<E> linkedList, E element, int index) {
        linkedList.add(index, element);
    }

    public boolean containsElement(LinkedList<E> linkedList, E element) {
        return linkedList.contains(element);
    }

    public boolean isLinkedListEmpty(LinkedList<E> linkedList) {
        return linkedList.isEmpty();
    }

    public LinkedList<Boolean> compareTwoLinkedList(LinkedList<E> linkedListOne, LinkedList<E> linkedListTwo) {
        LinkedList<Boolean> result = new LinkedList<>();

        int minSize = Math.min(linkedListOne.size(), linkedListTwo.size());
        for (int i = 0; i < minSize; i++) {
            result.add(linkedListOne.get(i).equals(linkedListTwo.get(i)));
        }

        int sizeDifference = Math.abs(linkedListOne.size() - linkedListTwo.size());
        if (sizeDifference > 0) {
            for (int i = 0; i < sizeDifference; i++) {
                result.add(false);
            }
        }
        return result;
    }
}
