package pl.kurs.homework.task2.app;

import pl.kurs.homework.task2.service.LinkedListService;

import java.util.LinkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedListService linkedListService = new LinkedListService();

        LinkedList<String> fruits1 = new LinkedList<>();
        fruits1.add("Apple");
        fruits1.add("Lemon");
        fruits1.add("Banana");
        fruits1.add("Mango");

        LinkedList<String> fruits2 = new LinkedList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Mango");

        LinkedList<Boolean> booleans1 = linkedListService.compareTwoLinkedList(fruits1, fruits2);

        System.out.println(booleans1);

        linkedListService.insertElement(fruits2, "Lemon", 1);

        LinkedList<Boolean> booleans2 = linkedListService.compareTwoLinkedList(fruits1, fruits2);

        System.out.println(booleans2);

        System.out.println(linkedListService.isLinkedListEmpty(fruits1));

        System.out.println(linkedListService.containsElement(fruits2, "Orange"));

        System.out.println(linkedListService.containsElement(fruits1, "Lemon"));
    }
}
