package com.green.day19.ch01;

public abstract class Experiment0 { // 추상클래스는 자식메소드 중에 하나라도 추상메소드가 있으면 자기자신도 추상메소드가 되어야할것.
    public abstract void play(int pos); // 강제성


}

class AudioPlayer extends Experiment0 {

    public void play(int pos) {
        System.out.println("Audio Player 위치 : " + pos);
    } // 추상메소드는 오버라이딩을 반드시 해줄것
}

class VideoPlayer extends Experiment0 {
    public void play(int pos) {
        System.out.println("Video Play 위치 : " + pos);
    }
}

class PlayerTest {
    public static void main(String[] args ) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Experiment0 player = ap;
        player.play(30);
        player = vp;
        player.play(40);
    }
}

abstract class DVDPlayer extends Experiment0 {


}
