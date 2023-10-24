package com.green.day19.ch01;

interface Fighterble extends Movable, Attackable {}

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(SC u);
}

class Fighter extends SC implements Fighterble {
    public void move(int x, int y) {

    }

    public void attack(SC v) {

    }
}

class SC3 {
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10, 30);
        Attackable attackable = new Fighter();

        Fighter fighter = (Fighter)movable;
        fighter.attack(null);

        Fighter fighting = (Fighter)attackable;
        fighting.attack(null);


        /*
        Fighter fighter = (Fighter)attackable;
        fighter.attack(null);
         */
    }
}
