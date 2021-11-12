package org.project;

import java.util.Scanner;

public class Lenght {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = (inch * 0.0254);
        System.out.println(inch + " inch is " + meters + " meters ");
    }
}
