/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.lesson6;
import java.util.Arrays;
/**
 *
 * @author lakov
 */
public class array {
public static void main(String[] args) {
    // int[] num = {1, 2, 3, 4};
    // int sam = sumArray(null);
    // System.out.println(sam);
    // int[] num1 = {3, 5, 7, 9};
    // int max = maxArray(num1);
    // System.err.println(max);
    // int[] num2 = {2, 4, 6, 8};
    // int min = minArray(num2);
    // System.out.println(min);
    // int[] num3 = {1, 2, 3, 4};
    // int[] dob = doubleArray(num3);
    // System.out.println(Arrays.toString(dob));
    // int[] num4 = {3, 4, 5, 8};
    // int ce = countEvens(num4);
    // System.out.println(ce);
    // int[] num5 = {1, 2, 3, 4};
    // int target = 3;
    // boolean ty = contains(num5, target);
    // System.out.println(ty);
    // int[] num6 = {1, 3, 5, 7};
    // int target =(5);
    // int i = indexOf(num6, target);
    // System.out.println(i);
    // int[] num7 = {2, 4, 2, 8};
    // int target = 2;
    // int i = lastIndexOf(num7, target);
    // System.out.println(i);
    // int[] num8 = {1, 2, 4, 5};
    // int[] res = reverseArray(num8);
    // System.out.println(Arrays.toString(res));
    int[] num9 = {-1, 2, -3, 4};
    int[] pos = filterPositive(num9);
    System.out.println(Arrays.toString(pos));
}
public static int sumArray(int[] num){
    int sum = 0;
    if (num == null){
        return 0;
    }
    for (int i = 0; i < num.length; i++) {
        sum = sum + num[i];
    } 
    return sum;
}

public static int maxArray(int[] num1) {
    int max = Integer.MIN_VALUE;
    if (num1 == null) {
        return max;
    }
    for (int i = 0; i < num1.length; i++){
         if (num1[i] > max){
            max = num1[i];
         }
    } return max;
}

public static int minArray(int[] num2) {
    int min = Integer.MAX_VALUE;
    if (num2 == null) {
        return min;
    }
    for (int i = 0; i < num2.length; i++) {
        if (num2[i] < min) {
            min = num2[i];
        }
    } return min;
}
public static int[] doubleArray(int[] num3) {
     int i;
     int[] mn = new int[num3.length];
     for (i = 0; i < num3.length; i++){
        mn[i] = num3[i] * 2;
     }
     return mn;
}

public static int countEvens(int[] num4) {
     int ch = 0;
     for (int i = 0; i < num4.length; i++) {
         if (num4[i] % 2 == 0){
            ch++;
         }
     }
     return ch;
}
public static boolean contains(int[] num5, int target) {
    for (int i =0; i < num5.length; i++){
        if(num5[i] == target){
            return true;
        }
    }
    return false;
}
public static int indexOf(int[] num6, int target) {
    for(int i = 0; i < num6.length; i++){
        if(num6[i] == target){
            return i;
        }
    }
    return -1;
}
public static int lastIndexOf(int[] num7, int target) {
    for (int i = num7.length - 1; i != 0; i--) {
        if(num7[i]==target){
            return i;
        }
    }return -1;
}
public static int[] reverseArray(int[] num8) {
    int j = 0;
    int[] nw = new int[num8.length];
    for (int i = num8.length - 1; i >= 0; i--) {
        nw[j] = num8[i];
        j++; 
    }
    return nw;
}
public static int[] filterPositive(int[] num9) {
    int[] pos = new int [num9.length];
    for (int i = 0; i < num9.length; i++) {
        pos[i] = num9[i];
        if (num9[i] < 0){
            pos[i] = num9[i] * -1;
        }
    }
    return pos;
}

}
