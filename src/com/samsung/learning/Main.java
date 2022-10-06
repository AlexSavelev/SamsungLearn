package com.samsung.learning;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale(Locale.US);

        int x = scanner.nextInt();
        System.out.println(x >= 100 && x <= 999 & x % 5 == 0);
    }

}
