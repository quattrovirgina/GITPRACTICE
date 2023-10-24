package com.green.day19.ch01;

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;


class SCG {
    public static void main(String[] args) {
        SC unit = new Dragoon();
        unit.move(10, 10);
        SC unit2 = new Goliath();
        unit.move(20, 10);


        List<SC> units = new ArrayList();
        units.add(unit);
        units.add(unit2);


    }
}
public abstract class SC {
    protected int x;
    protected int y;

    public abstract void move(int c, int d);
    public void stop() {
        System.out.println("현재 위치에 정지하라");
    }

    public void setX(int x) { // 세터함수
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Dragoon extends SC { // 생성자 호출은 생성자 내에서만. 그외에는 할수없다
    @Override
    public void move(int e, int f) {
        setX(e);
        setY(f);
        System.out.printf("드라군 좌표 %d, %d로 이동하라\n", e, f);
    }
    public void steamPack() {
        System.out.println("스팀팩 시전!!!");
    }
}

class Goliath extends SC {
    private boolean terran;
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("골리앗 좌표 %d, %d로 이동하라\n", x, y);
    }

    public void changeMode() {
        terran = !terran;
        System.out.println(terran ? "시즈모드 작동개시 " : "시즈모드 무장해제");
    }
}