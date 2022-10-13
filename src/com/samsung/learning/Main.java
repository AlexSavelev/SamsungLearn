package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();

        int r = 0;
        while(a != 0) {
            r += a % 10;
            a /= 10;
        }
        System.out.println(r);


    }

}
