package org.yourcompany.g_learning.lesson2;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Логические выражения =====
        int age = 20;
        boolean isStudent = true;

        // && (И) → оба условия должны быть true
        if (age >= 18 && isStudent) {
            System.out.println("Совершеннолетний студент");
        }

        // || (ИЛИ) → хотя бы одно условие true
        if (age < 18 || age > 65) {
            System.out.println("Не трудоспособный возраст");
        }

        // ! (НЕ) → отрицание
        boolean isAdult = false;
        if (!isAdult) {
            System.out.println("Несовершеннолетний");
        }

        // ===== if – else if – else =====
        System.out.print("Введите вашу оценку (0–100): ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 70) {
            System.out.println("Хорошо");
        } else if (score >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }

        // ===== Вложенные условия =====
        System.out.print("Введите логин: ");
        String login = sc.next();
        System.out.print("Введите пароль: ");
        String password = sc.next();

        if (login.equals("admin")) {                 // проверка логина
            if (password.equals("1234")) {           // проверка пароля
                System.out.println("Доступ разрешён");
            } else {
                System.out.println("Неверный пароль");
            }
        } else {
            System.out.println("Неверный логин");
        }

        // ===== switch =====
        System.out.print("Выберите действие (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Создать тест");
                break;
            case 2:
                System.out.println("Запустить тест");
                break;
            case 3:
                System.out.println("Посмотреть результаты");
                break;
            default:
                System.out.println("Неизвестный выбор");
        }

        // ===== Методы у строк =====
        sc.nextLine(); // очистка буфера
        System.out.print("Введите слово: ");
        String word = sc.nextLine();

        // length() — длина строки
        System.out.println("Длина строки: " + word.length());

        // toUpperCase(), toLowerCase() — регистр
        System.out.println("В верхнем регистре: " + word.toUpperCase());
        System.out.println("В нижнем регистре: " + word.toLowerCase());

        // contains() — проверка подстроки
        if (word.contains("a")) {
            System.out.println("Строка содержит букву 'a'");
        }

        // startsWith(), endsWith()
        if (word.startsWith("J")) {
            System.out.println("Строка начинается с 'J'");
        }
        if (word.endsWith("n")) {
            System.out.println("Строка заканчивается на 'n'");
        }

        // equals() — сравнение строк
        if (word.equals("Java")) {
            System.out.println("Вы ввели Java!");
        }

        sc.close();
    }
}
