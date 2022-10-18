package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        boolean a[] = new boolean[n];
        for(int i = 0; i < n - 1; ++i)
            a[scanner.nextInt() - 1] = true;

        for(int i = 0; i < n; ++i) {
            if(!a[i]) {
                System.out.println(i + 1);
                break;
            }
        }

    }

}
