package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();
        int c = scanner.nextInt(), d = scanner.nextInt();

        boolean f = true;
        int i = 10000;
        while(i < 99999) {
            if(i % a == b && i % c == d) {
                f = false;
                System.out.print(i + " ");
            }
            ++i;
        }

        if(f)
            System.out.println(-1);

    }

}
