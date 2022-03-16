package com.company;

public class GameEntity {
    public int health=0;
    public int damage=0;

    public GameEntity(int health, int damage) {
        setHealth(250);
        setDamage(50);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
