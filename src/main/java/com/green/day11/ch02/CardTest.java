package com.green.day11.ch02;

public class CardTest {
    public static void main(String[] args) {
        Card ca1 = new Card();

        ca1.kind = "SPADE";
        ca1.number = "A";

        Card ca2 = new Card();
        ca2.kind = "DIAMOND";
        ca2.number = "10";

        System.out.println("c1.kind : " + ca1.kind);
        System.out.println("c2.kind : " + ca2.kind);
        System.out.println(ca1.getScore());
        System.out.println(ca2.getScore());
    }
}
