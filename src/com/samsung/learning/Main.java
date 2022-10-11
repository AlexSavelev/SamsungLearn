package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        if(a > b) { int t = a; a = b; b = t; }
        if(a > c) { int t = a; a = c; c = t; }
        if(b > c) { int t = b; b = c; c = t; }

        if(c >= a + b) {
            System.out.println("impossible");
        } else if(a * a + b * b == c * c) {
            System.out.println("right");
        } else if(a * a + b * b > c * c) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }

    }

}
