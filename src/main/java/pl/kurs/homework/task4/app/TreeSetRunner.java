package pl.kurs.homework.task4.app;

import pl.kurs.homework.task4.service.TreeSetService;

import java.util.TreeSet;

public class TreeSetRunner {
    public static void main(String[] args) {

        TreeSetService treeSetService = new TreeSetService();

        TreeSet<Integer> integers = new TreeSet<>();

        integers.add(6);
        integers.add(34);
        integers.add(28);
        integers.add(1);
        integers.add(5);
        integers.add(33);
        integers.add(65);
        integers.add(13);
        integers.add(27);
        integers.add(19);
        integers.add(7);

        System.out.println(integers);

        System.out.println(treeSetService.returnAndRemoveLastElement(integers));

        System.out.println(treeSetService.returnLowerElement(integers, 19));

        System.out.println(integers);

    }
}
