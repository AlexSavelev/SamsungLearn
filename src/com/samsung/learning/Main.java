package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int s = 1;
        int r = 1;

        while(a / s > 9) {
            s *= 10;
            ++r;
        }
        System.out.println(r);

    }

}
