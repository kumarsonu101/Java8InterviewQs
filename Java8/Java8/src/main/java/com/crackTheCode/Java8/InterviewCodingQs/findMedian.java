package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findMedian {

    public static void main(String[] args) {
     List<Integer> list = Arrays.asList(8, 7, 2, 5, 3, 1, 6, 9, 10);
     Collections.sort(list);
    double median;
    int size = list.size();
    if (size % 2 == 0) {
     median = (list.get(size / 2 - 1) + list.get(size / 2)) / 2.0;
    } else {
     median = list.get(size / 2);
     }
    System.out.println("Sorted list: " + list);
    System.out.println("Median: " + median);
}
}
