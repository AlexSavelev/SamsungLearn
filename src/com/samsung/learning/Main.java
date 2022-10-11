package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = (scanner.nextInt() - 1) % 12;

        if(a % 2 == 0 && a <= 6) {
            System.out.println(31);
        } else if(a == 1) {
            System.out.println(28);
        } else if(a % 2 == 1 && a <= 6) {
            System.out.println(30);
        } else {
            System.out.println(30 + (a % 2));
        }


    }

}
