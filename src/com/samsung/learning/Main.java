package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int r = 0;

        int i = 26;
        while(i <= a) {
            r += i;
            i += 2;
        }
        System.out.println(r);

    }

}
