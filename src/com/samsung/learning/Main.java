package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();

        int t = 1;
        System.out.print(t + " ");

        for(int i = 1; i < n; ++i) {
            t += n + 1;
            System.out.print(t + " ");
        }

    }

}
