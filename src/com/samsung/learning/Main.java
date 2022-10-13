package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();

        int i = 0;
        int t = 2;
        while(i < n) {
            System.out.print(t + " ");
            t += 2;
            ++i;
        }


    }

}
