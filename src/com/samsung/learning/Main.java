package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int r = 1;
        int a = scanner.nextInt();
        while(a >= 0) {
            ++r;
            a = scanner.nextInt();
        }

        System.out.println(r);
    }

}
