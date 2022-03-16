package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss= new Boss(250,200,"AK-47");
        System.out.println("The boss has paramets:"+""+
                boss.getHealth()+ " "+ boss.damage+ " "+boss.getWeapon());
        System.out.println("_______________");
        System.out.println(boss.printInfo());
        Skeleton skeleton=new Skeleton(100,100,"drobovik");
        System.out.println(skeleton.getHealth()+" "+ skeleton.damage+ " "+ skeleton.getWeapon());
    }
}
