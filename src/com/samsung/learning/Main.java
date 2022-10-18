package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; ++i)
            arr[i] = i + 1;
        int a = scanner.nextInt() - 1, b = scanner.nextInt() - 1, c = scanner.nextInt() - 1, d = scanner.nextInt() - 1;

        while(a < b) {
            int t = arr[a];
            arr[a++] = arr[b];
            arr[b--] = t;
        }

        while(c < d) {
            int t = arr[c];
            arr[c++] = arr[d];
            arr[d--] = t;
        }

        for(int i: arr)
            System.out.print(i + " ");

    }

}
