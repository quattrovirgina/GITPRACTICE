package com.green.day15.ch01;


class Tv2 {
    boolean power;
    int channel; //1

    void power() {
        power = !power;
    }
    void channelup() {
        channel++;
    }

    void channeldown() {
        channel--;
    }
}

class CaptionTv2 extends Tv2 {
    int channel;
    boolean caption;

    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }

    void getParentChannel() {
        System.out.printf("parent-channel : %d\n", super.channel); //3
    }

}

public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 ctv = new CaptionTv2();
        ctv.channel = 10;
        ctv.channelup();

        System.out.printf("ctv.channel : %d\n", ctv.channel);
        ctv.getParentChannel();
    }
}
