package com.green.day18.ch01;

import java.util.Arrays;
public class MyArrayList3 {
    private int[] arr;

    public MyArrayList3() {
        arr = new int[0];
    }

    public void add(int n1) {
        int[] newone = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newone[i] = arr[i];
        }
        newone[arr.length] = n1;
        arr = newone;
    }

    public String toString() {
        if(arr.length == 0) { return "[]"; }
        String r = String.format("[%d", arr[0]);
        for(int i = 1; i < arr.length; i++) {
            r += String.format(" ,%d", arr[i]);

        }
        r += "]";
        return r;
    }
     public void add(int n1, int n2) {
        int[] tmp = new int[arr.length + 1];
        for(int i = 0; i < n1; i++) {
            tmp[i] = arr[i];
        }

        for(int j = n1; j < arr.length; j++) {
            tmp[j+1] = arr[j];
        }
        arr = tmp;
    }
}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList3 list = new MyArrayList3();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(2, 50);
        System.out.println(list);
        System.out.println(list);


    }
}
