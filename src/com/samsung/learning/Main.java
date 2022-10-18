package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; ++i)
            a[i] = scanner.nextInt();

        int index = 0;
        for(; index < n; ++index) {
            if(a[index] > 0) break;
        }

        for(int i = index; i < n; ++i) {
            if(a[i] >= 0)
                continue;
            int t = a[i];
            for(int j = i - 1; j >= index; --j) {
                a[j + 1] = a[j];
            }
            a[index++] = t;
        }

        for(int i: a)
            System.out.print(i + " ");

    }

}
