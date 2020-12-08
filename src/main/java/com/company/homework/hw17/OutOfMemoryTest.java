package com.company.homework.hw17;

import java.util.ArrayList;
import java.util.List;

// with heap default value: Memory out on 202 iteration with object size 1048576
// with heap 500M Memory out on 98 iteration with object size 1048576
// with heap 1.2G Memory out on 238 iteration with object size 1048576

public class OutOfMemoryTest {
    final static int objectSize = 1024*1024;

    public static void main(String[] args) {
        List<int[]> list = new ArrayList<int[]>();
        long i = 0;
        try {
            for (; i < Long.MAX_VALUE - 1; i++) {
                if (i % 1000 == 0 && i > 0) {
                    System.out.println("Created " + i + " objects");
                }
                list.add(getBigObject());
            }
        } catch (OutOfMemoryError x) {
            System.out.println("Memory out on " + i + " iteration with object size " + objectSize);
            x.printStackTrace();
        }
    }

    public static int[] getBigObject() {
        return new int[objectSize];
    }
}
