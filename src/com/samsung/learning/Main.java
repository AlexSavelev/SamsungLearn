package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static void minToBegin(int n[]) {
        int index = 0;
        for(int i = 0; i < n.length; ++i) {
            if(n[i] < n[index])
                index = i;
        }
        int el = n[index];
        for(int i = index - 1; i >= 0; --i)
            n[i + 1] = n[i];
        n[0] = el;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; ++i)
            a[i] = scanner.nextInt();
        minToBegin(a);
        for(int i: a) {
            System.out.print(i + " ");
        }

    }

}
