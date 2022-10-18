package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int r = 0, m = 0;
        boolean flag = true;

        int n = scanner.nextInt();
        for(int i = 0; i < n; ++i) {
            int t = scanner.nextInt();
            if(t % 2 == 1 || t % 2 == -1) {
                flag = false;
                r += t;
                ++m;
            }
        }
        System.out.println((flag ? "NO" : String.format("%.2f", (float)r / m)));

    }

}
