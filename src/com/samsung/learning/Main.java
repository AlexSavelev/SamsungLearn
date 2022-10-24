package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static int sumOfDigits(int n) {
        int t = 0;
        while(n != 0) {
            t += n % 10;
            n /= 10;
        }
        return t;
    }
    public static int sumOfThirteen(int a) {
        int t = 0;
        for(int i = 0; i < a; ++i) {
            if(sumOfDigits(i) % 13 == 0)
                ++t;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();

        System.out.println(sumOfThirteen(a));

    }

}
