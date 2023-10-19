package com.green.day16.ch02;

public class Animal {
    public void crying() {
        System.out.println("동물이 운다");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        // 부모타입은 자식 객체 주소값을 담을수 있음
        Dog d1 = new BullDog();
        Animal d2 = new Dog();
        Animal d3 = new Cat();

        // 자식타입은 부모객체 주소값을담을수 없음.
        // BullDog bull1 = new Dog();

        Dog d4 = new Dog();
        Animal b5 = d4;
        System.out.println("END");

        // 타입은 알고있는 메소드만 호출할수 있고 가능하다면 객체기준임.

        BullDog bull3 = new BullDog();
        bull3.jumping();
        bull3.crying();

        Dog dog2 = new BullDog();




    }
}

class AnimalTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        BullDog bulldog = new BullDog();
        // 불독까지 넘어왔을때 jump 메소드까지 호출할것

        CallCrying(dog);
        CallCrying(cat);
        CallCrying(bulldog);
    }
   private static void CallCrying(Animal animatron) {
        animatron.crying();

        if(animatron instanceof BullDog) {
            BullDog bd = (BullDog)animatron;
            bd.jumping();
        }
   }
}

class Dog extends Animal {
    @Override
    public void crying() { // 오버라이드
        System.out.println("멍! 멍!");
    }
}
class BullDog extends Dog { // 객체기준
    public void crying() {
        System.out.println("불독이 왈! 왈!");
    }

    public void jumping() {
        System.out.println("불독이 점프! 점프!");
    }
}

class Cat extends Animal {
    public void crying() {
        System.out.println("야옹~ 야옹~");
    }
}
