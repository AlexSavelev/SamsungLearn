package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        boolean flag = true;

        int i = 0;
        while(i < n) {
            int a = scanner.nextInt();
            if(a < 437) {
                flag = false;
                System.out.println("Crash " + (i + 1));
                break;
            }
            ++i;
        }
        if(flag)
            System.out.println("No crash");

    }

}
