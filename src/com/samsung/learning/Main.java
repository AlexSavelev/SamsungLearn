package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();

        boolean setMinus = (a >= 0 || b >= 0) && (a <= 0 || b <= 0);

        if(a == 0 || b == 0) {
            System.out.println(0);
        } else {
            a = a > 0 ? a : -a;
            int t = a;
            b = b > 0 ? b : -b;
            while(b > 1) {
                a += t;
                --b;
            }
            System.out.println((setMinus ? "-" : "") + a);
        }


    }

}
