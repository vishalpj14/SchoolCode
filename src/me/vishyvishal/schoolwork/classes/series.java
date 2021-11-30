package me.vishyvishal.schoolwork.classes;

import java.util.Scanner;

public class series {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, n;
        double s = 0;
        System.out.println("Enter value of a");
        n = in.nextInt();
        for (a = 1; a <= 10; a++) {
            s=s+1.0/Math.pow(2,a);
        }
        System.out.println("The sum of series =" +s);


    }
}
