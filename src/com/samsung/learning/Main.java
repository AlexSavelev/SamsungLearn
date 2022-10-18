package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        while(n > 1) {
            System.out.print(n % 2);
            n /= 2;
        }
        System.out.println(n);

    }

}
