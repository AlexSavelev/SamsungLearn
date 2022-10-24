package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static int minOf2(int a, int b) {
        return (a < b) ? a : b;
    }
    public static int min(int a, int b, int c, int d) {
        return minOf2(minOf2(a, b), minOf2(c, d));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println(trianglePerimetr(-15809, 20304, 18912, -10503, 10020, 22779));

    }

}
