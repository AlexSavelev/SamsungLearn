package com.samsung.learning;

public class Main {

    public static void main(String[] args) {
        Pet p1 = new Pet("Tima", "Alexandr", "Cat");
        Pet p2 = new Pet("Rex", "Angelika", "Dog");

        System.out.println(p1);
        System.out.println(p2);

        p1.addVisit(1667928379);

        System.out.println(p1.getLastVisit());
        for(int i : p1.getVisits()) {
            System.out.println(i);
        }

    }

}
