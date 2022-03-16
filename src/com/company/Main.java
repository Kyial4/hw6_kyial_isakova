package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss= new Boss(250,200);
        boss.weapon.setNameOfWeapon("лук");
        boss.weapon.setTypeOfWeapon("стрелы");
        System.out.println(boss.printInfo());
        Skeleton skeleton=new Skeleton(100,100,10);
        skeleton.weapon.setNameOfWeapon("пистолет");
        skeleton.weapon.setTypeOfWeapon("пули");
        System.out.println(skeleton.printInfo());
        Skeleton skeleton1=new Skeleton(90,1,1);
        skeleton1.weapon.setNameOfWeapon("автомат");
        skeleton1.weapon.setTypeOfWeapon("пули");
        System.out.println(skeleton1.printInfo());
    }
}
