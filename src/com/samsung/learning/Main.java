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
        while(arr.length != 0) {
            int t = arr[0];

            int newN = 0;
            for(int i: arr) {
                if(t != i)
                    ++newN;
            }

            int newArr[] = new int[newN];
            int k = 0;
            for(int i: arr) {
                if(t != i)
                    newArr[k++] = i;
            }

            arr = newArr;
            ++r;
        }
        System.out.println(r);

    }

}
