/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.step2.l1l_Classes_objects;

/**
 *
 * @author lakov
 */
class Kalkulator {
    int result;
    void summa(int i, int defaultResult) {
        result = defaultResult + i;
        System.out.println(result);
    }
    void raznost(int i){
        result = 0 -  i;
        System.out.println(result);
    }
    void umnojenie(int i) {
        result = 0 * i;
        System.out.println(result);
    }
    void delenie(int i) {
        result = 0 / i;
        System.out.println(result);
    }
    
}
public class Calkulatator {

    public static void main(String[] args) {
        Kalkulator i = new Kalkulator();

        
        
        i.summa(3, 0);
        i.raznost(7);
        i.umnojenie(5);
        i.delenie(2);
    }

}

