package com.green.day10.ch02;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox rnb = new ReturnNumberBox();
        int r1 = rnb.sum(10, 20);

        System.out.println("r1 : " + r1);

        int r2 = rnb.sum(10, 20);
        System.out.println("r1 : " );
        System.out.println("---- 끝 ------");

        int r3 = rnb.abs(-10);
        System.out.println("r3:  " + r3);
        System.out.println("-------- 끝 ---------");
    }
}
