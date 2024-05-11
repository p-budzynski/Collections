package pl.kurs.homework.task3.app;

import pl.kurs.homework.task3.service.HashSetService;

import java.util.HashSet;

public class HashSetRunner {
    public static void main(String[] args) {
        HashSetService hashSetService = new HashSetService();

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(8);
        set2.add(3);
        set2.add(5);
        set2.add(6);

        System.out.println(hashSetService.findCommonElements(set1, set2));

        System.out.println(hashSetService.containsAllElements(set1, set2));


    }
}
