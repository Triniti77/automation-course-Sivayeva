package com.company.homework.hw16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestUtil {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,0,20,1,22,5,8,9);
        Map<Integer, Integer> map = Util.duplicateIdentifier(list);
        System.out.println(map);
    }
}
