package org.yourcompany.g_learning.lesson3;

public class MathOperation {
	// Класс содержит простой пример основных математических операций для новичка.
	// Все примеры выводятся в методе main, чтобы можно было запустить программу и увидеть результаты.

	public static void main(String[] args) {
		// 1) Сложение
		int a = 10;
		int b = 3;
		int sum = a + b; // оператор + складывает два числа
		System.out.println("Сложение: " + a + " + " + b + " = " + sum);

		// 2) Вычитание
		int diff = a - b; // оператор - вычитает второе число из первого
		System.out.println("Вычитание: " + a + " - " + b + " = " + diff);

		// 3) Умножение
		int mul = a * b; // оператор * умножает
		System.out.println("Умножение: " + a + " * " + b + " = " + mul);

		// 4) Деление (целочисленное и с плавающей точкой)
		int divInt = a / b; // целочисленное деление: дробная часть отбрасывается
		double divDouble = (double) a / b; // чтобы получить дробный результат, приводим к double
		System.out.println("Деление (int): " + a + " / " + b + " = " + divInt);
		System.out.println("Деление (double): " + a + " / " + b + " = " + divDouble);

		// 5) Остаток от деления
		int rem = a % b; // оператор % возвращает остаток от деления
		System.out.println("Остаток: " + a + " % " + b + " = " + rem);

		// 6) Возведение в степень (для целых степеней) — используем Math.pow
		double pow = Math.pow(a, 3); // a в степени 3
		System.out.println("Степень: " + a + "^3 = " + (int) pow);

		// 7) Квадратный корень
		double sqrt = Math.sqrt(16); // извлекает квадратный корень
		System.out.println("Квадратный корень из 16 = " + sqrt);

		// 8) Инкремент и декремент
		int x = 5;
		System.out.println("x = " + x);
		x++; // постфиксный инкремент: увеличивает x на 1
		System.out.println("После x++ => " + x);
		++x; // префиксный инкремент: сначала увеличивает, затем возвращает
		System.out.println("После ++x => " + x);
		x--; // декремент
		System.out.println("После x-- => " + x);

		// 9) Приоритет операций
		int result1 = 2 + 3 * 4; // умножение выполняется раньше сложения
		int result2 = (2 + 3) * 4; // скобки меняют порядок, сначала выполняется сложение
		System.out.println("2 + 3 * 4 = " + result1 + " (умножение раньше)");
		System.out.println("(2 + 3) * 4 = " + result2 + " (скобки меняют порядок)");

		// 10) Пример со смешанными типами (int и double)
		int i = 7;
		double d = 2.5;
		double mixed = i + d; // int будет автоматически приведён к double
		System.out.println("Смешанные типы: " + i + " + " + d + " = " + mixed);

		// Конец примеров
	}
}
