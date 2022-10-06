package com.samsung.learning;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale(Locale.US);

        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.println((a % 2 == 0 ? 1 : 0) + (b % 2 == 0 ? 1 : 0) + (c % 2 == 0 ? 1 : 0) >= 2);
    }

}
