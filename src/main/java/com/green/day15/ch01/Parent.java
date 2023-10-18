package com.green.day15.ch01;

public class Parent {
    public Parent() {}
    int age;


}

class Child extends Parent { // 새로 생성하는 child는 parent를 상속받는다
    void play() {
        System.out.printf("나는 %d살이야. 놀자", age);
    }
}

class Child2 extends Parent { // Child2도 Parent를 상속받았기에 여기서도 int age를 사용할수 있다

    public Child2() {
        super();
    }
    void jump() {
        System.out.printf("%d살의 아이가 점프를 한다.", age);
    }
}

class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 100;
        c1.play();

        Child2 c2 = new Child2();
        c2.age = 99;
        c2.jump();

    }
}
