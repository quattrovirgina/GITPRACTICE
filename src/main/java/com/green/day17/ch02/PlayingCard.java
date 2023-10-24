package com.green.day17.ch02;

public interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLUB = 1;

    public abstract String getCardNumber();
    String getCardKind();

}

class PlayingCardTest {
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLUB);
    }
}

interface PlayingChess extends PlayingCard {
    void moveMal(int x, int y);

}

abstract class Chess implements PlayingChess {
    public String GetCardNumber() {
        return null;
    }

}
class Card implements PlayingCard {
    public String getCardNumber() {
        return null;
    }

    public String getCardKind() {
        return null;
    }

}


