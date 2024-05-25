package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.*;

public class removeEvenFromAList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(8, 84, 7, 4, 1, 2, 5, 10, 3, 36, 12, 11, 20, 56));
        list.removeIf(n -> n % 2 == 0);
        System.out.println("Odd list" + " " + list);
    }
    
}
