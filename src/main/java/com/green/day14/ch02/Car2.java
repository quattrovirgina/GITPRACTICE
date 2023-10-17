package com.green.day14.ch02;

public class Car2 {
    String color;

    String gearType;

    int door;

    public Car2(Car2 c1) {
        this.color = c1.color;
        this.gearType = c1.gearType;
        this.door = c1.door;
    }
    public Car2() {

    }
    public void printmyself() {
        System.out.printf("color : %s, gearType : %s, door = %d \n", color, gearType, door);
    }
}

class Car2Test {
    public static void main(String[] args) {

        Car2 c1 = new Car2();

        c1.color = "black";

        c1.gearType = "MANUAL";

        c1.door = 10;


        Car2 c2 = new Car2(c1);

        c1.printmyself();
        c2.printmyself();
    }
}
