/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.lesson5;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author lakov
 */
public class taska5 {

public static void main(String[] args) {
        // primer1();
        // primer2();
        // primer3();
        // primer4();
        // copyArray();
        // copyRange();
        stroka();
        // primer8();
    }
public static void primer1() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Vvedite chislo: ");
    int n = sc.nextInt();
    int[] num = new int [n]; 
    for (int i = 0; i < n; i++) {
        num [i] =  i + 1;
       }System.out.println(Arrays.toString(num));
   }
public static void printWorldsFromArray() {
    Scanner sc = new Scanner (System.in);
    System.out.println("Vvedite text: ");
    String text = sc.nextLine();
    String[] words = text.split(" ");
    for ( int i = 0; i < text.length(); i++)
    System.out.println(words[i]) ;
   }
public static void primer3() {
    int[] y = {6, 8, 1, 10};
    Arrays.sort(y);
    System.out.println(Arrays.toString(y));
   }
public static void primer4() {

    int[] i = {1, 2, 3};
    int[] j = {1, 2, 3};
    int y;
    boolean isEqual = true;

    boolean isEqualLength = i.length == j.length;

    if(isEqualLength) {
        for (y = 0; y < i.length;y++) { // y 0, 1 2
            int temp = i[y]; // 1 3 3
            int temp2 = j[y]; // 1 2 3

            if(isEqual) {
                isEqual = i[y] == j[y]; // t f t
            }
            
        }

        if(isEqual == true && isEqualLength == true) {
            System.out.println("TRUE");
        } else {
            System.err.println("FALSE");
        }

    } else {
        System.out.println("FALSE");
    }
  }

public static void copyArray() {
    Scanner sc = new Scanner (System.in);
    System.out.println("Vvedite dlinu massiva: ");
    int length = sc.nextInt();
    int[] originalArray = {5, 2, 3};
    int[] newArray = new int [length]; // { 0, 0 ,0 ,0 ,0} при n = 5 dlina.length()

    for (int i = 0; i < originalArray.length; i++) {
        newArray[i] = originalArray[i];
    }

    System.out.println(Arrays.toString(newArray));
   }
public static void copyRange() {
    Scanner sc = new Scanner (System.in);
    System.out.println("Print range (from and to): ");
    int from = sc.nextInt();
    int to = sc.nextInt();
    int[] array = {1, 3, 5, 7, 9}; 
    int[] rangeArray = new int [to - from + 1];
    int j = 0;

    for (int i = from; i <= to; i++) {
        rangeArray[j] = array[i];
        j++;
    }
    System.out.println(Arrays.toString(rangeArray));

}

public static void stroka () {

    int[] array = {1, 3, 5}; 
    System.out.print("[");
    
    for (int i = 0; i < array.length; i++) {

        int j =  array[i];
        System.out.print( j );

        if(array.length > i + 1) {
            System.out.print(",");
        } 

    }
    System.out.print("]");

}

}