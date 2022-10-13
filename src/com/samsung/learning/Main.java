package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int r = -1;

        while(a != 0 && r == -1) {
            if((a % 10) % 2 == 1)
                r = a % 10;
            a /= 10;
        }
        System.out.println(r != -1 ? r : "NO");

    }

}
