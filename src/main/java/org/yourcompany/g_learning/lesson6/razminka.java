/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.lesson6;

/**
 *
 * @author lakov
 */
public class razminka {
    public static void main(String[] args) {
        welcome();
        int mn = doubleIt (6);
        System.out.println("Mn: " + mn);
        int doble = square(2);
        System.out.println("Resalt: " + doble);
        sayGoodbye ("Galina");
        boolean bool = isPozitive (5);
        System.out.println("5 > 0: " + bool);
    }
    public static void welcome() {
        System.out.println("Welcome!");
    }

    public static int doubleIt(int n) {
        return n * 2;
    }

    public static int square(int n) {
        return n * n;
    }
    public static void sayGoodbye(String name) {
        System.out.println("Goodbye, "+ name + "!");
    }
    public static boolean isPozitive (int num) {
        return  num > 0;
    }
}
