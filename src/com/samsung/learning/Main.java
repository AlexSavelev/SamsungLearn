package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        boolean f = a % 2 != 0 || a == 2;

        int i = 3;
        while(i < a / 2 && f) {
            if(a % i == 0) {
                f = false;
            }
            i += 2;
        }
        System.out.println(f ? "prime" : "composite");


    }

}
