package com.green.day18.ch02;

import java.util.*;
public class Experiment2 {
    public static void main(String[] args) {
        Buyer4 buyer = new Buyer4();
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Tv2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
    }
}

class Buyer4 {
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    //Product2 객체의 주소값 여러개 저장 가능
    private int money;
    private int bonusPoint;

    private Product2[] productArr;
    private int i;

    private Map<String, Integer> buyItems;

    public Buyer4() {
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