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
}
