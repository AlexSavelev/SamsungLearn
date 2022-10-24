package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static double avgOf4Digit(int n[]) {
        long t = 0L, cnt = 0;
        for(int i: n) {
            if(i / 1000 != 0 && i / 10000 == 0) {
                ++cnt;
                t += i;
            }
        }
        if(cnt == 0)
            return -1.0;
        return t / (double)cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; ++i)
            a[i] = scanner.nextInt();
        System.out.println(avgOf4Digit(a));

    }

}
