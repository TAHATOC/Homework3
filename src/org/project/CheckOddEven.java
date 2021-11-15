package org.project;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter your number");
        Scanner Check = new Scanner(System.in);
        num = Check.nextInt();
        if ( num %2 == 0) {
            System.out.println( "Odd Number" );
        }
        else {
            System.out.println( "Even Number" );   //
        }
        System.out.println( "Bye" );
    }
}