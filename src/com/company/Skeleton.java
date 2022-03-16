package com.company;

public class Skeleton extends Boss{
    public int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public Skeleton(int health, int damage, String weapon) {
        super(health, damage, weapon);
    }

    public String printInfo(){
        return super.printInfo()+" "+arrows;
    }
}
