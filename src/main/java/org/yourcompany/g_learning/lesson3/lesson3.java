package org.yourcompany.g_learning.lesson3;

public class lesson3 {
    public static void main(String[] args) {
        // Создаём массив целых чисел
        int[] numbers = {10, 20, 5, 15, 30};

        // Выводим длину массива
        System.out.println("Длина массива: " + numbers.length);

        // Перебираем массив с помощью цикла for
        for (int i = 0; i < numbers.length; i++) {
            // Выводим элемент массива по индексу i
            System.out.println("Элемент с индексом " + i + ": " + numbers[i]);
        }

        // Считаем сумму всех элементов массива
        int sum = 0; // переменная для накопления суммы
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // добавляем текущий элемент к сумме
        }
        System.out.println("Сумма элементов массива: " + sum);

        // Находим минимальное значение в массиве
        int min = numbers[0]; // считаем первый элемент минимальным
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) { // если нашли число меньше текущего минимума
                min = numbers[i];  // обновляем минимальное значение
            }
        }
        System.out.println("Минимальное число в массиве: " + min);

        // Демонстрация ошибки выхода за пределы массива (закомментировано)
        // System.out.println(numbers[5]); // Ошибка: индекс выходит за границы массива
    }
}
