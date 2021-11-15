package org.project;

import java.util.Scanner;

public class Magnitude {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int X = input.nextInt();
        System.out.println("Enter second number");
        int Y = input.nextInt();

        if (Math.abs(X) > Math.abs(Y)) {
            System.out.println("The number "  + X +  " has the greatest value" );
        } else {
            System.out.println("The number "  + Y +  " has the greatest value" );
        }
    }
}
