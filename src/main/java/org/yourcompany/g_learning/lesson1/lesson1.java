

package org.yourcompany.g_learning.lesson1;

import java.util.Scanner;

// Класс — это "контейнер" для кода. Имя файла должно совпадать с именем класса.
public class lesson1 {
    // main — точка входа. Программа всегда начинает выполнение отсюда.
    public static void main(String[] args) {
        
        // Выводим текст в консоль (вывод на экран)
        System.out.println("=== Первая программа с примерами ===");
        
        // Создаём объект Scanner для чтения данных от пользователя
        Scanner sc = new Scanner(System.in);

        // ======= Работа со строками =======
        System.out.print("Введите ваше имя: ");  // просим ввести имя
        String name = sc.nextLine();             // сохраняем введённый текст в переменную
        System.out.println("Привет, " + name + "!"); // выводим приветствие

        // ======= Работа с числами =======
        System.out.print("Введите ваш возраст: ");
        int age = sc.nextInt(); // читаем целое число (int)

        // ======= Работа с условием if/else =======
        // Проверим возраст пользователя
        if (age >= 18) {
            System.out.println("Вы совершеннолетний.");
        } else {
            System.out.println("Вы ещё не достигли 18 лет.");
        }

        // ======= Работа с логическим типом (boolean) =======
        boolean isAdult = age >= 18; // выражение возвращает true или false
        System.out.println("Флаг isAdult = " + isAdult);

        // Закрываем Scanner (хорошая практика, когда ввод больше не нужен)
        sc.close();

        // Конец программы
        System.out.println("=== Программа завершена ===");
    }
}