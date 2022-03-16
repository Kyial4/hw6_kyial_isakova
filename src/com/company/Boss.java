package com.company;

public class Boss extends GameEntity{
    public String weapon;
    public Boss(int health, int damage, String weapon) {
        super(health, damage);
        this.weapon=weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return health + " "+ damage+" "+ weapon;
    }
}


