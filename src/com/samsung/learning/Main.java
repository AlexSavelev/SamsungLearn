package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        boolean flag = true;
        int r = a + 1;

        while(true) {
            int i = 2;
            while(i < r / 2) {
                if(r % i++ == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                break;
            flag = true;
            ++r;
        }
        System.out.println(r);

    }

}
