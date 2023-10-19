package com.green.day16.ch02;

public class SingleTone {
    private SingleTone() {}

    private static SingleTone sgt;
    public static SingleTone getInstance() {
        if(sgt == null) {
            sgt = new SingleTone();
            System.out.println("COMPLETE");
        }

        else {
            sgt = new SingleTone();
            System.out.println("ERROR");
        }
        return sgt;
    }
}

class SingleToneTest {
    public static void main(String[] args) {
        SingleTone s1 = SingleTone.getInstance();
        SingleTone s2 = SingleTone.getInstance(); // 이미 s1에서 주소를 넣었기에 null값이 뜨지 않는다
        SingleTone s3 = SingleTone.getInstance();
    }
}
