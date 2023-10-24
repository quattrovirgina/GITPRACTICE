package com.green.day19.ch01;

import com.green.day16.ch01.PackageTest;

import java.util.*;
public class SC2 {
    public static void main(String[] args) {
        List<SC> units = new ArrayList();
        units.add(new Dragoon());
        units.add(new Dragoon());
        units.add(new Dragoon());
        units.add(new Goliath());
        units.add(new Goliath());
        units.add(new Goliath());
        units.add(new Goliath());

        moveAll(units, 30, 50);

        SC unit1 = units.get(units.size() - 1);
        Goliath sc1 = (Goliath)unit1;
        sc1.changeMode();
        sc1.changeMode();
        sc1.changeMode();

    }

    public static void moveAll(List<SC> units, int x, int y) {
        for (int i = 0; i < units.size(); i++) {
            units.get(i).move(x, y);

        }
    }
}


