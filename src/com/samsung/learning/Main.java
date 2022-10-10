package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();

        System.out.print(a + " ");

        if((a / 10) % 10 == 1 || a % 10 >= 5 || a % 10 == 0) {
            System.out.println("TORTOV");
        } else if(a % 10 == 1) {
            System.out.println("TORT");
        } else {
            System.out.println("TORTA");
        }

    }

}
