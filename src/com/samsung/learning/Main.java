package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];

        a[0] = 4;
        for(int i = 1; i < n; ++i)
            a[i] = a[i - 1] + 3;

        for(int i: a)
            System.out.print(i + " ");

    }

}
