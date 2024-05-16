package pl.kurs.homework.additionaltask;

import java.util.*;

public class AdditionalTaskRunner {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("yellow");
        colors.add("red");
        colors.add("white");
        colors.add("orange");
        colors.add("pink");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        colors.add("brown");
        colors.add("violet");

        Collections.sort(colors);
        System.out.println("Sorted list: " + colors);

        int index = Collections.binarySearch(colors, "green");
        System.out.println("Index of green color: " + index);

        List<String> copyColors = new ArrayList<>(Collections.nCopies(colors.size(), ""));
        Collections.copy(copyColors, colors);
        System.out.println("Copied list: " + copyColors);

        Collections.reverse(colors);
        System.out.println("Reverse order: " + colors);

        Collections.swap(colors, 2, 8);
        System.out.println("Index elements 2 and 8 swapped: " + colors);

        Collections.shuffle(colors);
        System.out.println("Shuffled elements: " + colors);

        System.out.println("Min value: " + Collections.min(colors));
        System.out.println("Max value: " + Collections.max(colors));

        Collections.fill(colors, "silver");
        System.out.println("All elements replaced: " + colors);

        System.out.println("Color silver: " + Collections.frequency(colors, "silver"));



    }
}
