package com.green.day14.ch01;

public class CardTest3 {
    public static void main(String[] args) {
        Deck de = new Deck();

        Card3 c1 = de.getCard();
        Card3 c2 = de.getCard();

        for(int i = 0; i < 53; i++) {
            Card3 c3 = de.getCard();
            c3.printmyself();
        }


    }
}
