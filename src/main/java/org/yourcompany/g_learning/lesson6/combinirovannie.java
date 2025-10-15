/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.lesson6;

/**
 *
 * @author lakov
 */
public class combinirovannie {
public static void main(String[] args) {
    int times = 5;
    String text ="Ivan";
    String pr = repeat(text, times);
    System.out.println(pr);
    int[] mas = {1, 2, 3, 4};
    String masnew = joinWithComma(mas);
    System.out.println(masnew.trim());
    int[] dano = {1, 2, 3, 4};
    int sum2 = sumOfSquares(dano);
    System.out.println(sum2);
    String test = "S a l as ";
    boolean pal = isPalindrome(test);
    System.out.println(pal);
    String norm = normalizePhone("1(122-45");
    System.out.println(norm);
}
public static String repeat(String text, int times) {
    if(times <= 0) {
        return "";
    }
    String povt = text;
    for (int i = 1; i != times; i++) {
        povt = povt + text;
    }
    return povt;
    }
public static String joinWithComma (int[] mas) {
    if(mas.length == 0){
        return "";
    }
    String masnew = "";
    for(int i = 0; i < mas.length; i++){
        if(i == mas.length - 1){
            masnew += mas[i]; 
        }
        else {
            masnew += mas[i] + ",";
        }
    }
    return masnew;
}
public static int sumOfSquares(int[] dano) {
    int sum2 = 0;
    for (int i = 0; i < dano.length; i++) {
        sum2 += dano[i] * dano[i];
    } 
    return sum2;
}
public static boolean isPalindrome (String pal) {
    String newpal = pal;
    newpal = newpal.replaceAll(" ", "");
    String pal2 = "";
    for(int i = newpal.length() -1; i >= 0; i--){
        pal2 = pal2 + newpal.charAt(i);
    }
    if(pal2.equalsIgnoreCase(newpal)){
    return true;
    }
    else {
        return false;
    }
}
public static String normalizePhone(String norm) {
    String n = "";
    for(int i = 0; i < norm.length(); i++){
        if (Character.isDigit(norm.charAt(i))) {
            n = n + norm.charAt(i);
        }
    }
    return n;
}
}

// PetShop - магазин животных - отдельный класс
   // поля
   // количество котов
   // количетсов собак
   // количестов попугаев

   // методы:
   // спросить есть ли попугай?
   // спросить есть ли собака?
   // спросить есть ли кот?
   // купить попугая - животное
    // купить кота - животное
    // купить собаку - животное

// Cat, Dog, Parrot  - 3 отдельных класса
    // поле возраст
    // поле имя
    // метод голос 

// перед покупками надо добавить количество животных в магазин
// В маин реализовать сенарий покупки любого животного, например
// Есть попугаи?
 // если нет, то спросить про другое животно, если есть, то вызвать у магазина метод покупки
 // метод покупки должен вернуть объект попугая
 // дать имя попугаю, и присвоить возраст
// Вывести в консоль итоговые параметры купленного животного и вызвать меьод голоса
