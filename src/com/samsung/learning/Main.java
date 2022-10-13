package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int r = 0;
        int a = scanner.nextInt();
        while(a / 10 != 0 && a / 100 == 0) {
            r += a % 10;
            r += (a / 10) % 10;
            a = scanner.nextInt();
        }

        System.out.println(r);
    }

}
