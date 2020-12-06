package com.company.homework.hw16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {
    public static Map<Integer, Integer> duplicateIdentifier(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer item : list) {
            Integer count = result.getOrDefault(item, 0);
            result.put(item, count+1);
        }
        return result;
    }
}
