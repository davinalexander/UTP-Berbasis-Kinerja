package com.company;

public class Titan extends Character {

    public Titan(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    @Override
    public boolean attack() {
        double HitChance = Math.random();
        if (HitChance < 0.4){
            return true;
        }
        return false;
    }

    @Override
    public void info() {
        System.out.println("------------ STATUS ------------");
        System.out.println("Role        : Titan");
        System.out.println("HP          : "+getHP());
        System.out.println("Attack      : "+getAttack());
        System.out.println("Defense     : "+getDefense());
    }
}
