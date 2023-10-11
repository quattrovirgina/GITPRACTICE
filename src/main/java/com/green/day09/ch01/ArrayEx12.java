package com.green.day09.ch01;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "KIM", "PARK", "LEE" };

        names[1] = "RIM";

        for(int i = 0; i < names.length; i++) {
            System.out.printf("names[%d] : %s\n", i, names[i]);
        }

        for(String str : names) {
            System.out.println(str);
        }
    }
}
