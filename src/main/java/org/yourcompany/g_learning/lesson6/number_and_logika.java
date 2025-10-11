/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.lesson6;

/**
 *
 * @author lakov
 */
public class number_and_logika {

    public static void main(String[] args) {
        int min = difference(5, 10);
        System.err.println("Difference: " + min);
        int bol = max(6, 5);
        System.out.println("Max: " + bol);
        int three = maxOfThree(3, 5, 7);
        System.out.println("MaxOfThree: " + three);
        boolean iseven = isEven (10);
        System.out.println("Iseven: " + iseven);
        int sum = sumFrom1ToN (4);
        System.out.println("Sum 1 + n = " + sum);
        int avera = average (2, 3, 12);
        System.out.println("Midle znachenue: " + avera);
        int plas = abc (-2);
        System.out.println("Plas znachenie: " + plas);
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        else if (b > a && b > c) {
            return b;
        }
        else {
            return c;
        }
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static int sumFrom1ToN(int n) {
        int i = 0;
        int sum = 0;
        do { 
             sum += i;
             i++;
        } while (i <= n);
       return sum;
    }

    public static int average(int a, int b, int c) {
        int sum = a + b + c;
       return sum / 3;
    }

    public static int abc(int a) {
        if (a < 0) {
            return a * -1;
        }
        else {
            return a;
        }
    }

}
