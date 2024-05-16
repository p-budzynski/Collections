package pl.kurs.homework.task6.app;

import pl.kurs.homework.task6.service.TreeMapService;

import java.util.TreeMap;

public class TreeMapRunner {
    public static void main(String[] args) {
        TreeMapService treeMapService = new TreeMapService();

        TreeMap<Integer, String> numbers = new TreeMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(5, "five");
        numbers.put(7, "seven");
        numbers.put(3, "three");
        numbers.put(8, "eight");

        System.out.println(numbers);

        System.out.println(treeMapService.getNextKey(numbers,5));
        System.out.println(treeMapService.getNextKey(numbers,7));

        System.out.println(treeMapService.subMapGreaterOrEqual(numbers, 4));
        System.out.println(treeMapService.subMapGreaterOrEqual(numbers, 7));


    }
}
