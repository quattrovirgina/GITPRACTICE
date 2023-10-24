package com.green.day18.ch02;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Experiment {
    public static void main(String[] args) {

    }

}
class Buyer3 {
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    //Product2 객체의 주소값 여러개 저장 가능
    private int money;
    private int bonusPoint;

    private Product2[] productArr;
    private int i;

    private Map<String, Integer> buyItems;

    public Buyer3() {
        buyItems = new HashMap();
        this.money = 15000;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }

    public void buy(Product2 p) {
        if (i == productArr.length) {
            System.out.println("더 이상 구매할 수 없습니다.");
            return;
        }
        if (money < p.getPrice()) {
            System.out.println("금액이 부족합니다.");
            return;
        }
        productArr[i++] = p;
        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();
        String productName = p.getName();
        if(buyItems.containsKey(productName)) {
            buyItems.put(productName, buyItems.get(productName) + 1);
        }
        else {
            buyItems.put(productName, 1);
        }
        System.out.printf("%s을(를) 구매하였습니다.\n", productName);
    }


    public void summary() {
        int total = 0;
        i = 0;
        while(i != productArr.length && productArr[i] != null) {
            total += productArr[i].getPrice();
            i++;
        }
        System.out.println("총 금액은 "+total+"원입니다. 그만사");
    }
}

class Audio2 extends Product2 {
    public Audio2() {
        super("Audio", 500);
    }
}

class Computer2 extends Product2 {
    public Computer2() {
        super("Computer", 200);
    }
}

class Tv2 extends Product2 {
    public Tv2() {
        super("Tv", 100);
    }
}

class Product2 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = price / 10;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %d, bonusPoint: %d", name, price, bonusPoint);
    }
}

