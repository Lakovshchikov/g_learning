## Что такое Java

Java — это язык программирования, который используют для веба, мобильных приложений (Android), бэкенда и автоматизации.

Особенность: программы на Java работают на любой системе, если там установлена JVM (виртуальная машина Java).

Написал один раз — запускается везде (Write once, run anywhere).

## Структура программы

Простейшая программа в Java выглядит так:

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Разбор «по косточкам»:

- `public class HelloWorld` → класс. В Java код организован в классах.
- `{ ... }` → фигурные скобки — начало и конец блока кода.
- `public static void main(String[] args)` → главный метод, с него начинается выполнение программы.
- `System.out.println("Hello, World!");` → команда вывести текст на экран.

## Минимальные термины, которые стоит упомянуть

- Класс — контейнер для кода.
- Метод — набор инструкций.
- `main` — метод, который запускается первым.
- Переменная — ячейка для хранения данных.

Примеры переменных:

```java
int age = 25; // целое число
String name = "Ivan"; // строка
```

Типы данных:

- `int` — целое число
- `double` — дробное число
- `boolean` — `true` / `false`
- `String` — текст

## Ввод и вывод данных

Вывод в консоль:

```java
System.out.println("Привет!");
```

Ввод с клавиатуры (Scanner):

```java
import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Вы ввели: " + number);
        sc.close();
    }
}
```

## Как это связано с алгоритмами

Алгоритм в псевдокоде легко перевести в Java.

Псевдокод:

```
ВВОД A, B
ЕСЛИ A < B ТО ВЫВОД A ИНАЧЕ ВЫВОД B
```

Java:

```java
if (a < b) {
    System.out.println(a);
} else {
    System.out.println(b);
}
```

## Ошибки и точки внимания новичка

- Регистр букв важен: `System` ≠ `system`.
- Каждая инструкция заканчивается `;`.
- Файл должен называться так же, как класс: `HelloWorld.java` → класс `HelloWorld`.
