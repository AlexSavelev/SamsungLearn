package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();

        if(a / 10 == 0 && a >= 0) {
            System.out.println("DIGIT");
        } else if(a / 100 == 0 && a > 0) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }

    }

}
