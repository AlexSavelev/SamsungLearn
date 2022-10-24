package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static int digitCount(int a) {
        int t = (a == 0 ? 1 : 0);
        while(a != 0) {
            ++t;
            a /= 10;
        }
        return t;
    }
    public static void printMatrix(int a[][]) {
        for(int t[]: a) {
            for(int i: t) {
                int k = 3 - digitCount(i);
                for(int j = 0; j < k; ++j)
                    System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int s = 2 * n + 1, direction = 1; /* 1 - up */
        int a[][] = new int[s][s];

        int t = 1, sizeCounter = 1;
        int i = n, j = n, maxI, maxJ;
        while(i <= s && j <= s) {
            maxI = i; maxJ = j;
            if(direction == 1) {
                i -= sizeCounter;
                if(i < 0) break;
                while(maxI > i)
                    a[maxI--][maxJ] = t++;
            } else if(direction == 2) {
                j += sizeCounter;
                if(j > s) break;
                while(maxJ < j)
                    a[maxI][maxJ++] = t++;
            } else if(direction == 3) {
                i += sizeCounter + 1;
                if(i > s) break;
                while(maxI < i)
                    a[maxI++][maxJ] = t++;
            } else if(direction == 4) {
                j -= sizeCounter + 1;
                if(j < 0) break;
                while(maxJ > j)
                    a[maxI][maxJ--] = t++;
            }
            if(++direction > 4) {
                direction = 1;
                sizeCounter += 2;
            }
        }

        printMatrix(a);
    }

}
