package com.green.day15.ch01;

class Tv {

    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelup() {
        channel+=2;
    }

    void channeldown() {
        channel--;
    }
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}

public class CaptionTbTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power = %b\n", cTv.power);
        cTv.power();
        System.out.printf("cTv.power = %b\n", cTv.power);
        cTv.power();
        System.out.printf("cTv.power = %b\n", cTv.power);
        cTv.channel = 19;
        cTv.channelup();
        System.out.printf("cTv.channel : %d\n", cTv.channel);
        cTv.power();
        cTv.displayCaption("내 누군지 아니?");
        System.out.printf("cTv: %s\n", cTv.power);
        cTv.caption = true;
        cTv.displayCaption("내 누군지 아니?");


    }
}
