package org.project;

import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {
        int mark;
        System.out.println("Enter number of mark");
        Scanner Check = new Scanner(System.in);
        mark = Check.nextInt();
        if ( mark >= 50) {
            System.out.println( "PASS" );
        }
        else {
            System.out.println( "FAIL" );   //
        }
        System.out.println( "Done" );
    }
}