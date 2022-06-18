package com.company;

public class Magician extends Character {


    public Magician(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    @Override
    public boolean attack() {
        double HitChance = Math.random();
        if (HitChance < 0.35){
            return true;
        }
        return false;
    }

    @Override
    public void info() {
        System.out.println("------------ STATUS ------------");
        System.out.println("Role        : Magician");
        System.out.println("HP          : "+getHP());
        System.out.println("Attack      : "+getAttack());
        System.out.println("Defense     : "+getDefense());
    }
}
