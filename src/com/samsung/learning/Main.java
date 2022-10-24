package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static double segmentLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3) {
        return segmentLength(x1, y1, x2, y2) + segmentLength(x2, y2, x3, y3) + segmentLength(x1, y1, x3, y3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println(trianglePerimetr(-2, -4, -3, -4, -1, 1));

    }

}
