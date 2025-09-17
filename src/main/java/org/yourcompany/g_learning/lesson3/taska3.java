/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.lesson3;

public class taska3 {

    public static void main(String[] args) {

    // int [] num = {10, 2, 30, 4, 5};
    // int sum = 0;
    // for (int i = 0; i < num.length; i++){
    //     sum+=num[i];
    // } 
    // System.out.println("Summa massiva: "+ sum);

    //  int [] num = {2, 12, 3, 15};
    //  int min = num[0];
    //  for (int i = 1; i < num.length; i++){
    //     if (num[i] < min) {
    //         min = num[i];
    //     }
    //  } 
    //  System.out.println("Minimalnoe chislo: " + min);
    // int [] num = {4, 13, 7, 29};
    // int max = num [0];
    // for (int i = 0; i < num.length; i++) {
    //     if (num[i] > max){
    //         max = num[i];
    //     }
    // }
    // System.out.println("Maximalnoe chislo: " + max);

    // int [] num = {5, 10, 15, 21};
    // int sum = 0;
    // for (int i = 0; i < num.length; i++) {
    //    sum+=num[i];
    // } 
    
    // System.out.println("Srednee znachenie: " + sum / num.length);
    
    int [] num = {1, 2, 3, 4, 5, 6};
    int chet = 0;
    for (int i = 0; i < num.length; i++){
        if ( num [i] % 2 ==0){
            chet++;
        }
    }
    System.out.println("Chetnoe chislo: " + chet);

   }
}
