/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.lesson4;

import java.util.Scanner;
/**
 *
 * @author lakov
 */
public class taska4 {

public static void main(String[] args) {
        // primer1();
        // primer2();
        // primer3();
        // primer4();
        // primer5();
        // primer6();
        // primer7();
        primer8();
    }

    public static void primer1 () {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        if (n == 0) {
            System.out.println("0");
        } 
        if (n > 0) {
            while (n != i) {
                System.out.println( "n " + n--);
                if (n == i) {
                    System.out.println("n 0");
                }
            }
        } 
        else {
            while (n != i) { 
                System.out.println("n " + n++);
                if (n == i) {
                    System.out.println("n 0");
                }
            }
        }
    
    
    
    
    }

    public static void primer2 () {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        do {n = sc.nextInt();
            sum = sum + n;
        } while (n != 0);
        System.out.println ("Vivod: " + sum);

    } 

    public static void primer3 () {
        Scanner sc = new Scanner(System.in);
        String pas;
        boolean start;
        boolean end;
        boolean tr;
        boolean hasdigit;
        do { System.out.println("Vvedite password: ");
            pas = sc.nextLine();
            start = pas.startsWith(" ");
            end = pas.endsWith(" ");
            int chislo = pas.length();
            tr = chislo >= 6;
            hasdigit = pas.matches(".*\\d.*");

        } while (start || end || !tr || !hasdigit);
        System.out.println("Password prinyat");
    }
    public static void primer4 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite chislo: ");
        int n = sc.nextInt();
        for (int p = 1; p <= 10; p++) {
            System.out.println( n + "*" + p + "=" + n * p);
        }
    }
    public static void primer5 () {
         Scanner sc = new Scanner(System.in);
         System.out.println("Vvedite chislo: ");
         int n = sc.nextInt();
         int sum = 0;
         for (int p = 1; p <= n; p++) {
            int y = p * p; 
             sum = sum + y;
         }
         System.out.println("Vivod: " + sum);

    }
    public static void primer6 () {
        int i; 
        int j;
        for (i = 1; i <= 5; i++) {
            for ( j =1; j <= 5; j++) {
                System.out.println("(" + i + "," + j + ")");
            }
        } System.out.println();

    }

    public static void primer7 () {
        int i; 
        int j;
        for (i = 1; i <= 9; i++ ) {
            for (j = 1; j <= 9; j++) {
                    if ( i + j == 10 ) {
                        System.out.println("(" + i + "," + j + ")");
                    }
                    System.out.println( );
                }
            }
        }

    public static void primer8 () {
    Scanner sc = new Scanner(System.in);
    System.out.println("Vvedite too cisla (chirinu end visotu): ");
    int w = sc.nextInt();
    int h = sc.nextInt();
    for (int i = 1; i <= w; i++) {
        for (int j = 1; j <= h; j++) {
            System.out.print("*");
        }
         System.out.println("\n");
    }

    }
}

