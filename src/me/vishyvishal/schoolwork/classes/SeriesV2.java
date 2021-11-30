package me.vishyvishal.schoolwork.classes;

import java.util.Scanner;

public class SeriesV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, a;
        double s = 0;
        System.out.println("Enter the value of a");
        a = in.nextInt();
        for (i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                s = s + Math.pow(a, i);

            } else {
                s = s - Math.pow(a, i);
            }
            System.out.println("The sum of series ="+s);
        }
    }
}

