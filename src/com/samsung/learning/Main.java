package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        if(a > b) {
            System.out.println(a > c ? a : c);
        } else {
            System.out.println(b > c ? b : c);
        }


    }

}
