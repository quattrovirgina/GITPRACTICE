package com.green.day18.ch01;

import java.util.*;

import java.util.Arrays;
public class ArrayTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        System.out.println(list);
    }
}
