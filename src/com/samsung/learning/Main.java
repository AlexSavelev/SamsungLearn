package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; ++i)
            a[i] = scanner.nextInt();

        int record = 0, recordNum = 0;
        for(int i: a) {
            int t = 0;
            for(int j: a) {
                if(j == i)
                    ++t;
            }
            if(t > recordNum) {
                record = i;
                recordNum = t;
            }
        }
        System.out.println(record);

    }

}
