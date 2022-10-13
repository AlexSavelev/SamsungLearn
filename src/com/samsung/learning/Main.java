package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int r = 0;
        int a = scanner.nextInt(), b = scanner.nextInt();
        while(a >= b) {
            ++r;
            a -= b;
        }
        System.out.println(r + " " + a);
    }

}
