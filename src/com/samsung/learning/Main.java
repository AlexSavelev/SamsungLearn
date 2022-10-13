package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int r = 0;
        int s = 1;
        while(a > s - 1) {
            ++r;
            s *= 2;
        }
        System.out.println(r);

    }

}
