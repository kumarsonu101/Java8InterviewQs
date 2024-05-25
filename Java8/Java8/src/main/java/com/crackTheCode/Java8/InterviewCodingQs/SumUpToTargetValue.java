package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.*;

public class SumUpToTargetValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 7, 2, 5, 3, 1, 6, 9, 10);
        int target = 10;
        Set<Integer> seen = new HashSet<>();

        list.stream().forEach(num -> {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            seen.add(num);
        });
    }
}