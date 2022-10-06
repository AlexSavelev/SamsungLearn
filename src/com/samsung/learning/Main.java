package com.samsung.learning;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale(Locale.US);

        double x = scanner.nextDouble(), y = scanner.nextDouble();

        boolean a = (x * x + y * y <= 1) || (y <= 1 && y >= 0 && x <= 1 && x >= 0);

        System.out.println(a ? "YES" : "NO");
    }

}
