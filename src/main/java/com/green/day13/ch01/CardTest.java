package com.green.day13.ch01;

class Card {

        String pattern; // 카테고리

        String denomination; // 문자열 저장

        public void Printyourself() {
                System.out.printf("%s - %s\n", pattern, denomination);
        }

}
public class CardTest {
        public static void main(String[] args) {
                Card c = new Card();

                Card[] cards = makeCards();

                for(Card s : cards) {
                        s.Printyourself();
                        System.out.println("---------------------------------");
                }


        }

        public static Card[] makeCards() {
                Card[] deck = new Card[52];
                int i = 0;
                for(i = 0; i < 13; i++) {
                        Card[] deck2 = new Card[13];
                        deck2 = Spade(deck);

                        deck[i] = deck2[i];
                }

                for(i = 13; i < 26; i++) {
                        Card[] deck3 = new Card[13];
                        deck3 = Diamond(deck);

                        deck[i] = deck3[i];
                }

                for(i = 26; i < 39; i++) {
                        Card[] deck4 = new Card[13];
                        deck4 = Heart(deck);
                        deck[i] = deck4[i];
                }

                for(i = 39; i < 52; i++) {
                        Card[] deck5 = new Card[13];
                        deck5 = Club(deck);
                        deck[i] = deck5[i];
                }

                return deck;
        }

        public static Card[] Spade(Card[] arr) {

                arr = new Card[13];


                for(int i = 0; i < 13; i++) {
                        String no = Joker(i+1);

                        Card ca3 = new Card();

                        ca3.pattern = "SPADE";
                        ca3.denomination = no;

                        arr[i] = ca3;
                }

                return arr;
        }

        public static Card[] Diamond(Card[] arr2) {
                arr2 = new Card[26];

                for(int i = 13; i < 26; i++) {

                        Card ca4 = new Card();
                        String no2 = Joker(i - 12);
                        ca4.pattern = "DIAMOND";
                        ca4.denomination = no2;

                        arr2[i] = ca4;
                }

                return arr2;
        }

        public static Card[] Heart(Card[] arr3) {
                arr3 = new Card[39];

                for(int i = 26; i < 39; i++) {

                        Card ca5 = new Card();
                        String no3 = Joker(i - 25);
                        ca5.pattern = "HEART";
                        ca5.denomination = no3;

                        arr3[i] = ca5;
                }

                return arr3;
        }

        public static Card[] Club(Card[] arr6) {
                arr6 = new Card[52];

                for(int i = 39; i < 52; i++) {

                        Card ca6 = new Card();
                        String no4 = Joker(i - 38);
                        ca6.pattern = "CLUB";
                        ca6.denomination = no4;

                        arr6[i] = ca6;
                }

                return arr6;
        }

        public static String Joker(int n1) {
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

}
