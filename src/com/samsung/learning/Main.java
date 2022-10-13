package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int r = 0;
        int a = scanner.nextInt();
        while(a % 5 != 0) {
            if(a > 10)
                r += a;
            a = scanner.nextInt();
        }
        if(a > 10)
            r += a;

        System.out.println(r);

    }

}
