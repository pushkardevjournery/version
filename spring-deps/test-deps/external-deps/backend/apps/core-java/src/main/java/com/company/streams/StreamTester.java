package com.company.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTester {

    public static void main(String[] args) {
        StreamTester obj = new StreamTester();
        int[] nums = {2, 1, 3, 4, -2, -3, -1, 0, 1};
        String s = "Bangalore is a beautiful city";

        System.out.println("\n Display Even Numbers: ");
        obj.displayEvenNumber(nums);

        System.out.println("\n Reverse an Array of Numbers: ");
        obj.reverseArray(nums);

        System.out.println("\n Count Occurrence of Characters: ");
        obj.countOccurrenceOfCharacters(s);

        System.out.println("\n Find Duplicate Characters: ");
        obj.findDuplicates(s);

        System.out.println("\n Remove Duplicates from Array: ");
        System.out.println(obj.removeDuplicates(s));
    }

    public void displayEvenNumber(int[] nums) {
        Arrays.stream(nums)
                .boxed()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }

    public void reverseArray(int[] nums) {
        Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list;
                }))
                .forEach(n -> System.out.print(n + " "));
    }

    public void countOccurrenceOfCharacters(String s) {
        s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }

    public void findDuplicates(String s) {
        s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public String removeDuplicates(String s) {
        return s.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

}
