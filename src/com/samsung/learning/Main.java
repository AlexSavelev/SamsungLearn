package com.samsung.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();

        // R3
        if(a == 100) System.out.print("C");
        // R2
        int t = (a / 10) % 10;
        if(t == 1) System.out.print("X");
        else if(t == 2) System.out.print("XX");
        else if(t == 3) System.out.print("XXX");
        else if(t == 4) System.out.print("XL");
        else if(t == 5) System.out.print("L");
        else if(t == 6) System.out.print("LX");
        else if(t == 7) System.out.print("LXX");
        else if(t == 8) System.out.print("LXXX");
        else if(t == 9) System.out.print("XC");
        // R1
        t = a % 10;
        if(t == 1) System.out.print("I");
        else if(t == 2) System.out.print("II");
        else if(t == 3) System.out.print("III");
        else if(t == 4) System.out.print("IV");
        else if(t == 5) System.out.print("V");
        else if(t == 6) System.out.print("VI");
        else if(t == 7) System.out.print("VII");
        else if(t == 8) System.out.print("VIII");
        else if(t == 9) System.out.print("IX");

    }

}
