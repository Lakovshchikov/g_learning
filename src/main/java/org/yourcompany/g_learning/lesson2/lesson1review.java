package org.yourcompany.g_learning.lesson2;

import java.util.Scanner;

public class lesson1review {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = sc.nextLine();

        System.out.print("Введите возраст: ");
        int age = sc.nextInt();

        if (name.equals("Ivan")) {
            System.out.println("Привет, Иван!");
        } else {
            System.out.println("Привет, гость!");
        }

        if (age >= 18) {
            System.out.println("Вы совершеннолетний.");
        } else {
            System.out.println("Вы несовершеннолетний.");
        }

        sc.close();
    }
}
