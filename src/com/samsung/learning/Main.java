package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static double segmentLength(long x1, long y1, long x2, long y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double trianglePerimetr(long x1, long y1, long x2, long y2, long x3, long y3) {
        return segmentLength(x1, y1, x2, y2) + segmentLength(x2, y2, x3, y3) + segmentLength(x1, y1, x3, y3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println(trianglePerimetr(-15809, 20304, 18912, -10503, 10020, 22779));

    }

}
