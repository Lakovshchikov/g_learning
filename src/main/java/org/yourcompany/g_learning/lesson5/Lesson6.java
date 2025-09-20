package org.yourcompany.g_learning.lesson5;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
        example();
    }

    public static void example() {
        // ===== Создание массивов =====
        int[] arr1 = {5, 3, 8, 1, 4};
        int[] arr2 = {5, 3, 8, 1, 4};
        int[] arr3 = {10, 20, 30};

        // ===== Arrays.toString =====
        System.out.println("arr1: " + Arrays.toString(arr1));

        // ===== Arrays.sort =====
        Arrays.sort(arr1);
        System.out.println("arr1 after sort: " + Arrays.toString(arr1));

        // ===== Arrays.equals =====
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("arr1 и arr2 is equal? " + isEqual);

        // ===== Arrays.fill =====
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Arrray after fill: " + Arrays.toString(filled));

        // ===== Arrays.copyOf =====
        int[] copy = Arrays.copyOf(arr3, 5); // увеличиваем длину
        System.out.println("Copy arr3 with length 5: " + Arrays.toString(copy));

        // ===== Arrays.copyOfRange =====
        int[] part = Arrays.copyOfRange(arr3, 1, 3);
        System.out.println("Part of arr3: " + Arrays.toString(part));

        // ===== Работа с несколькими массивами =====
        String[] names1 = {"Ivan", "Anna", "Sergey"};
        String[] names2 = {"Maria", "Petr"};

        // Объединяем два массива в новый (без задачки на объединение, просто демонстрация)
        String[] allNames = new String[names1.length + names2.length];
        System.arraycopy(names1, 0, allNames, 0, names1.length);
        System.arraycopy(names2, 0, allNames, names1.length, names2.length);

        System.out.println("All names: " + Arrays.toString(allNames));

        // Сравниваем строки в массивах
        System.out.println("First name in names1: " + names1[0]);
        System.out.println("First name in names2: " + names2[0]);
        System.out.println("Are they equal? " + names1[0].equals(names2[0]));

        // Создадим двумерный массив на базе двух одномерных
        int[][] matrix = {arr1, arr3};
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
    }
}

