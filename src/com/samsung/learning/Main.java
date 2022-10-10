package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt(), b = -1 * scanner.nextInt();

        // a|x| > b
        if(a == 0) {
            System.out.println(0 > b ? "any x" : "no such x");
        } else {
            double p = Math.round((double)(b) / a * 10.0) / 10.0;
            if(a > 0) {
                // |x| > p
                if(p < 0) {
                    System.out.println("any x");
                } else {
                    System.out.println("x<" + -1.0 * p + " or x>" + p);
                }
            } else {
                // |x| < p
                if(p <= 0) {
                    System.out.println("no such x");
                } else {
                    System.out.println(-1.0 * p + "<x<" + p);
                }
            }
        }

    }

}
