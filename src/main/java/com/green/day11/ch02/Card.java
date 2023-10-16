package com.green.day11.ch02;

public class Card {
    String kind;
    String number;

    public int getScore() {
        int a = 0;
        switch(number) {
            case "A":
                a = 1;
                break;
            case "J":
                a = 11;
                break;
            case "Q":
                a = 12;
                break;
            case "K":
                a = 13;
                break;
            default:
                a = Integer.parseInt(number);
                break;
        }

        return a;
    }
}
