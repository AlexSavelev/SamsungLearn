package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int r = 0;
        boolean flag = true;

        int n = scanner.nextInt();
        for(int i = 0; i < n; ++i) {
            int t = scanner.nextInt();
            if(t % 2 == 0) {
                flag = false;
                r += t;
            }
        }
        System.out.println((flag ? "NO" : r));

    }

}
