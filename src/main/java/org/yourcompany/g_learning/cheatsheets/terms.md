# Основные термины для новичка в Java

Ниже — минимально необходимый набор терминов с пояснениями и короткими примерами.

## Переменная (variable)

Именованное хранилище значения.

```java
int age = 20; // объявление переменной типа int и присвоение значения
```

## Объявление переменной

Создание переменной с указанием типа (без присвоения значения возможно).

```java
String name; // объявление
name = "Иван"; // присвоение
```

## Присвоение значения (assignment)

Операция записи значения в переменную.

```java
int x = 5; // присвоение 5 переменной x
x = x + 2; // теперь x == 7
```

## Типы данных (primitive и ссылочные)

Примитивы: int, long, double, boolean, char и т.д. Ссылочные: объекты (String, List и т.д.).

```java
double price = 9.99;     // примитив
String text = "hello";   // ссылочный тип
```

## Константа (final)

Переменная, которую нельзя изменить после инициализации.

```java
final int DAYS_IN_WEEK = 7;
```

## Класс и объект

Класс — шаблон, объект — экземпляр класса.

```java
class Person { String name; }
Person p = new Person(); // создание объекта (инстанцирование)
```

## Инстанцирование (создание объекта)

Использование `new` для создания экземпляра.

```java
ArrayList<String> list = new ArrayList<>();
```

## Конструктор

Метод класса, вызывается при создании объекта.

```java
class Point {
    int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }
}
Point p = new Point(1, 2);
```

## Метод (function / procedure)

Блок кода, выполняющий действие.

```java
int sum(int a, int b) { return a + b; }
int s = sum(2, 3); // вызов метода с аргументами 2 и 3
```

## Вызов метода и аргументы/параметры

Аргументы — значения при вызове; параметры — переменные в объявлении метода.

```java
void greet(String name) { System.out.println("Hi " + name); }
greet("Anna"); // "Anna" — аргумент
```

## Возвращаемое значение

Тип, который метод возвращает (или `void` если ничего не возвращает).

```java
String id() { return "abc"; }
```

## Перегрузка методов (overloading)

Несколько методов с одним именем, разными параметрами.

```java
void print(int a) {}
void print(String s) {}
```

## Наследование (extends)

Класс наследует поведение другого класса.

```java
class Animal {}
class Dog extends Animal {}
```

## Интерфейс (interface)

Контракт методов, который реализуют классы.

```java
interface Flyable { void fly(); }
class Bird implements Flyable { public void fly() { } }
```

## Инкапсуляция (инкапсуляция)

Сокрытие данных через `private` и доступ через методы (геттеры/сеттеры).

```java
class Person {
    private String name;
    public String getName() { return name; }
    public void setName(String n) { name = n; }
}
```

## Модификаторы доступа

public, private, protected, (package-private) — контролируют видимость.

```java
public class A {}      // видна везде
private int secret;    // видна только внутри класса
```

## static (статические члены)

Члены класса, общие для всех экземпляров.

```java
class Util { static int count; }
```

## Пакет и import

Пакет группирует классы; import позволяет использовать классы из других пакетов.

```java
package org.example;
import java.util.List;
```

## Исключения и обработка (try-catch-finally)

Механизм обработки ошибок во время выполнения.

```java
try {
    int r = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Ошибка деления");
} finally {
    System.out.println("выполнится всегда");
}
```

## Коллекции (List, Set, Map)

Структуры для хранения наборов данных.

```java
List<String> list = new ArrayList<>();
Map<String, Integer> map = new HashMap<>();
```

## Циклы и условные операторы

Обычные управляющие конструкции: if, switch, for, while, foreach.

```java
for (int i = 0; i < 5; i++) { System.out.println(i); }
if (x > 0) { ... } else { ... }
```

## null и NullPointerException

`null` означает отсутствие ссылки; при обращении к null возникает NPE.

```java
String s = null;
s.length(); // вызовет NullPointerException
```

## Область видимости (scope)

Где видна переменная: локальная, поле класса, метод, блок.

```java
void f() {
    int a = 1; // локальная переменная
}
```

## Lambda и функциональные интерфейсы (Java 8+)

Короткие функции как объекты.

```java
List<Integer> nums = List.of(1,2,3);
nums.forEach(n -> System.out.println(n));
```

## Stream (основы)

Поток операций над коллекцией.

```java
List<String> names = List.of("Ann","Bob");
long count = names.stream().filter(s -> s.startsWith("A")).count();
```

---

Этот набор покрывает базовые понятия, которые важно знать новичку. Для каждого термина полезно практиковаться в кратких примерах и читать официальную документацию по мере роста навыков.
