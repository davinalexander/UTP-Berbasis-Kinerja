package com.company;

public abstract class  Character {
    private int defense;
    private int attack;
    private int HP;

    public Character(int defense, int attack, int HP) {
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage){
        if(damage > defense) {
            this.HP = (HP + defense) - damage;
        }
        if(this.HP <= 0){
            HP = 0;
        }
    }

    public abstract void info();

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
