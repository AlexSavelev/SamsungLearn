package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();

        boolean f = false;
        while(a / 10 != 0) {
            if(a % 10 == (a / 10) % 10) {
                f = true;
                break;
            }
            a /= 10;
        }
        System.out.println(f ? "YES" : "NO");


    }

}
