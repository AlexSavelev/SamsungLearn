package com.samsung.learning;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale(Locale.US);

        double x = scanner.nextDouble();
        System.out.println(x >= 3 && x <= 8);
    }

}
