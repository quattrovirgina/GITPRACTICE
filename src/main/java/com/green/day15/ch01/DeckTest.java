package com.green.day15.ch01;

class Card {
    static final int KINDMAX = 4; // 카드 무늬의 수
    static final int NUMMAX = 13; // 무늬별 카드수

    static final int SPADE = 4;

    static final int DIAMOND = 3;

    static final int HEART = 2;

    static final int CLUB = 1;

    int kind;
    int number;


    public Card() {
        this(SPADE, 1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;

    }

    public String toString() {

        return "kind: " + kind + " number: " + number;

    }

}

class Deck {
    final int CARDNUM = 52;

    Card[] newone = new Card[CARDNUM];

    public Deck() {
        int idx = 0;
        for(int i = 1; i <= Card.KINDMAX; i++) {
            for(int j = 1; j <= Card.NUMMAX; j++) {
                newone[idx++] = new Card(i, j);

            }
        }

        for(Card ca : newone) {
            System.out.println(ca);
        }

    }

    public Card pick(int n1) {
        return newone[n1];
    }

    public Card pick() {
        int n2 = (int)(Math.random() * CARDNUM);

        return newone[n2];
    }

}
public class DeckTest {
    public static void main(String[] args) {
        Deck de = new Deck();
        Card c1 = de.pick(51);
        System.out.println(c1);
        Card c2 = de.pick();
        System.out.println("--------");
        System.out.println(c2);
    }
 }
