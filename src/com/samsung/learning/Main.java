package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt() - 1, b = scanner.nextInt();

        if(a < 0 || a > 11 || b < 1) {
            System.out.println(-1);
        } else if(a == 0) {
            if(b > 31)
                System.out.println(-1);
            else
                System.out.println(365 - b);
        } else if(a == 1) {
            if(b > 28)
                System.out.println(-1);
            else
                System.out.println(334 - b);
        } else if(a == 2) {
            if(b > 31)
                System.out.println(-1);
            else
                System.out.println(306 - b);
        } else if(a == 3) {
            if(b > 30)
                System.out.println(-1);
            else
                System.out.println(275 - b);
        } else if(a == 4) {
            if(b > 31)
                System.out.println(-1);
            else
                System.out.println(245 - b);
        } else if(a == 5) {
            if(b > 30)
                System.out.println(-1);
            else
                System.out.println(214 - b);
        } else if(a == 6) {
            if(b > 31)
                System.out.println(-1);
            else
                System.out.println(184 - b);
        } else if(a == 7) {
            if(b > 31)
                System.out.println(-1);
            else
                System.out.println(153 - b);
        } else if(a == 8) {
            if(b > 30)
                System.out.println(-1);
            else
                System.out.println(122 - b);
        } else if(a == 9) {
            if(b > 31)
                System.out.println(-1);
            else
                System.out.println(92 - b);
        } else if(a == 10) {
            if(b > 30)
                System.out.println(-1);
            else
                System.out.println(61 - b);
        } else if(a == 11) {
            if(b > 31)
                System.out.println(-1);
            else
                System.out.println(31 - b);
        }

    }

}
