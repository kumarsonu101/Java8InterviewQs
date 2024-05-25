package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.Collections;
import java.util.List;

public class SortNosAscDesc {
    public static void main(String[] args) {
        List<Integer> list = List.of(9,5,6,2,1,3,10,101,4,7,56);
        System.out.println("Ascending order");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("Descending order");
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
