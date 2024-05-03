package pl.kurs.homework.task1.app;

import pl.kurs.homework.task1.service.ArrayListService;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayListService arrayListService = new ArrayListService();

        List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        stringList.add("six");

        System.out.println(stringList);

        arrayListService.replaceThirdElement(stringList, "new element");
        System.out.println(stringList);

        stringList = arrayListService.increaseList(stringList, 100);

        stringList = arrayListService.trimList(stringList);

        arrayListService.clearList(stringList);
        System.out.println(stringList);

        System.out.println("------------------------------------");

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        System.out.println(integerList);

        arrayListService.replaceThirdElement(integerList, 666);
        System.out.println(integerList);

        integerList = arrayListService.increaseList(integerList, 50);
        System.out.println(integerList.size());

        integerList = arrayListService.trimList(integerList);
        System.out.println(integerList.size());

        arrayListService.clearList(integerList);
        System.out.println(integerList);

    }
}
