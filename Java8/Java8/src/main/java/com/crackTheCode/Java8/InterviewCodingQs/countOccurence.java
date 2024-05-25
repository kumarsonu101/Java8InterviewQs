package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countOccurence {

    public static void main(String[] args) {

        /*
         * Count the occurrences of each integer in a list?
         */
        List<Integer> list = List.of(10,50,10,10,15,10);
        Map<Integer, Long> frequencyMap = 
        list.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
