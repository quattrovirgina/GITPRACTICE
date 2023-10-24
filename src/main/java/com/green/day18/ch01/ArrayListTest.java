package com.green.day18.ch01;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        int val1 = 0;

        List list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(45);

        Object val2 = list.get(0);
        System.out.println(list.get(1));

        for(int i = 0; i < list.size(); i++) {
            System.out.printf("[%d]: %d \n", i, (int)(list.get(i)));
        }

        int j = 0;

        while(j != list.size()) {

        }

    }
}
