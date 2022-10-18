package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();

        int r = 0;
        for(int i = 1; i < n; ++i) {
            if(arr[i] > arr[i - 1])
                ++r;
        }
        System.out.println(r);

    }

}
