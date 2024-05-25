package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.stream.IntStream;
import java.util.*;

public class checkIfListIsInAscOrder {

    public static void main(String[] args) {
        /*
         * Check if given list is in ascending order.
         */
        List<Integer> list = Arrays.asList(1, 3, 2, 4, 5);
        boolean isSorted = IntStream.range(0, list.size() - 1).allMatch(i -> list.get(i) <= list.get(i + 1));
        System.out.println("Is the list sorted? " + isSorted);


        /*
         * Check if given list is in ascending order.
         */
        List<Integer> list1 = Arrays.asList(10, 9, 8, 7, 6, 5, 3, 4, 2, 1);
        boolean isSortedDesc = IntStream.range(0, list1.size() - 1)
                                        .allMatch(i -> list.get(i) >= list1.get(i + 1));
        System.out.println("Is the list sorted in descending order? " + isSortedDesc);
    }
}
