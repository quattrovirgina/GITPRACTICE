package com.green.day14.ch02;

public class Car {
    String color;
    String gearType; // 변속기 종류(오토, 수동)

    int door; // 문의 개수

    public Car(String color) {
        this.color = color; // String color와 color라는 이름이 같을때만 this 사용가능

        this.gearType = "AUTO";

        this.door = 4;
    }
    public Car() {

        this("WHITE", "AUTO", 4); // 하나만 넣어도 결과는 똑같음(오버로딩)

    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    public void printmyself() {
        System.out.printf("color : %s, gearType : %s, door = %d \n", color, gearType, door);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("BLUE");

        car1.printmyself(); // color: whilt, geartype=auto, door = 4;
        car2.printmyself(); // color: blue, geartype=auto, door = 4;
    }
}


