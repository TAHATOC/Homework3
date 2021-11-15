package org.project;

import java.util.Scanner;

public class Finder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter value for a : ");
        double a = scan.nextDouble();
        System.out.print("Please enter value for b : ");
        double b = scan.nextDouble();
        System.out.println(a + "x + (" + b + ") = 0");
        if (a == 0) {
            System.out.println("a = 0");
        }
            else if (b == 0) {
                System.out.println( "x = 0" );
            }
         else {
            double x = -b / a;
            System.out.println("x = " + x);

        }

    }
}