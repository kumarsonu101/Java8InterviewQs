package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.Collections;
import java.util.List;

public class rotateList {

    public static void main(String[] args) {
        List<Integer> list = List.of(10,50,10,10,15,10);
        Collections.rotate(list, 3);
    }
}
