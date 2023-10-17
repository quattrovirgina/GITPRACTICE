package com.green.day14.ch01;

public class Deck {
    Card3[] cards;

    public Deck() {
        cards = new Card3[52];
        String[] category = { "SPADE", "DIAMOND", "HEART", "CLUB" }; // String[] number로 번호생성

        int idx = 0;

        for(int i = 0; i < category.length; i++) {
            String pattern = category[i];

            for(int j = 1; j <= 13; j++) {

                String denomination = Joker(j);

                cards[idx++] = new Card3(pattern, denomination);


            }
        }
    }

    private String Joker(int n1) {
        String output = Integer.toString(n1);
        switch(output) {
            case "1":
                output = "ACE";
                break;
            case "11":
                output = "JACK";
                break;
            case "12":
                output = "QUEEN";
                break;
            case "13":
                output = "KING";
                break;
            default:
                break;
        }
        return output;
    }

    public void printAll() {
        for(Card3 str : cards) {
            str.printmyself();
        }
    }

    public Card3 getCard() { // 52개의 주소값 >> 호출할때마다 랜덤으로 줘야함 >>
        Card3 ca = null;
        int n1 = 0;
        while(true) {
            n1 = (int)(Math.random() * cards.length);

            ca = cards[n1];

            if(ca != null) {
                cards[n1] = null;
                break;
            }
        }

        return ca;
    }
}
