package com.company;

public class Healer extends Character {


    public Healer(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    @Override
    public boolean attack() {
        double HitChance = Math.random();
        if (HitChance < 0.85){
            return true;
        }
        return false;
    }

    public void Heal(){
        this.setHP(getHP() + 25);
    }


    @Override
    public void info() {
        System.out.println("------------ STATUS ------------");
        System.out.println("Role        : Healer");
        System.out.println("HP          : "+getHP());
        System.out.println("Attack      : "+getAttack());
        System.out.println("Defense     : "+getDefense());
    }
}
