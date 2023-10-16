package com.green.day13.ch01;

public class CardTest2 {
    public static void main(String[] args) {
        Cards[] deck = makeCards();
        System.out.println(deck.length);

        for(int i = 0; i < 52; i++) {
            System.out.println(deck[i].numbers);
        }
    }

    public static Cards[] makeCards() {
        Cards[] ca = new Cards[52];

        for(int i = 0; i < 52; i++) {
            String number = Integer.toString(i);
            Cards ca2 = new Cards();
            ca2.numbers = number;

            ca[i] = ca2;
        }


        return ca;
    }

    public static Cards[] Spade(Cards arr) {
        Cards[] ca3 = new Cards[12];

        for(int i = 0; i < 13; i++) {
            ca3[i].Category = "SPADE";
        }

        return ca3;
    }
}
