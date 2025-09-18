package org.yourcompany.g_learning.lesson4;


public class Lesson4 {
    public static void main(String[] args) {
        primer1();
        primer2();
        primer3();
    }

    public static void primer1 () {
        // ===== Цикл while =====
        // Демонстрация: выводим только чётные числа от 2 до 10
        int a = 2;
        while (a <= 10) {
            System.out.println("while: " + a);
            a += 2; // увеличиваем на 2
        }
    }

    public static void primer2 () {
        // ===== Цикл for =====
        // Демонстрация: выводим квадраты чисел от 1 до 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("for: " + i + "^2 = " + (i * i));
        }
    }

    public static void primer3 () {
        // ===== Вложенные циклы for =====
        // Демонстрация: выводим таблицу координат (x, y) для маленькой сетки 3x3
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                System.out.print("(" + x + "," + y + ") ");
            }
            System.out.println(); // переход на новую строку
        }
    }
    
}
