# 📚 Полный курс Java для начинающих

## 📌 Содержание

1. [Введение в Java](#1-введение-в-java)
2. [Примитивные типы данных](#2-примитивные-типы-данных)
3. [Переменные и операции](#3-переменные-и-операции)
4. [Условные конструкции](#4-условные-конструкции)
5. [Циклы](#5-циклы)
6. [Массивы](#6-массивы)
7. [Методы](#7-методы)
8. [Строки (String)](#8-строки-string)
9. [Классы и объекты](#9-классы-и-объекты)
10. [Практические советы](#10-практические-советы)
11. [Вопросы для самопроверки](#11-вопросы-для-самопроверки)

---

## 1. Введение в Java

### Что такое Java?

**Java** — это язык программирования, который используется повсеместно:

- Веб-приложения (бэкенд)
- Мобильные приложения (Android)
- Автоматизация тестирования
- Корпоративные системы

**Главная фишка Java:** "Написал один раз — работает везде" (Write once, run anywhere).

Программа на Java сначала компилируется в специальный код (байт-код), который затем выполняется на виртуальной машине Java (JVM). Благодаря этому программа работает на любой операционной системе: Windows, macOS, Linux.

### Структура простейшей программы

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Разбор по частям:**

- `public class HelloWorld` — объявление класса (контейнера для кода)
- `{...}` — фигурные скобки обозначают начало и конец блока кода
- `public static void main(String[] args)` — главный метод, с него начинается выполнение программы
- `System.out.println(...)` — команда вывести текст в консоль

**Важные правила:**

- Имя файла должно совпадать с именем класса: `HelloWorld.java`
- Регистр букв важен: `System` ≠ `system`
- Каждая инструкция заканчивается точкой с запятой `;`

### Ввод и вывод данных

**Вывод в консоль:**

```java
System.out.println("Привет!"); // вывод с переходом на новую строку
System.out.print("Без перехода"); // вывод без перехода
```

**Ввод с клавиатуры:**

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine(); // считываем строку

        System.out.print("Введите ваш возраст: ");
        int age = sc.nextInt(); // считываем целое число

        System.out.println("Привет, " + name + "! Тебе " + age + " лет.");
        sc.close();
    }
}
```

**Методы Scanner:**

- `nextInt()` — считывает целое число
- `nextDouble()` — считывает дробное число
- `nextLine()` — считывает строку
- `next()` — считывает одно слово

---

## 2. Примитивные типы данных

В Java есть **8 примитивных типов данных**. Они встроены в язык и хранят значение напрямую (в отличие от объектов).

### Целые числа

| Тип     | Размер  | Диапазон                              | Когда использовать         |
| ------- | ------- | ------------------------------------- | -------------------------- |
| `byte`  | 8 бит   | -128 ... 127                          | Для экономии памяти        |
| `short` | 16 бит  | -32,768 ... 32,767                    | Редко используется         |
| `int`   | 32 бита | -2,147,483,648 ... 2,147,483,647      | **Основной тип для чисел** |
| `long`  | 64 бита | -9 квинтиллионов ... +9 квинтиллионов | Очень большие числа        |

**Примеры:**

```java
int age = 25;
int population = 1000000;
long bigNumber = 10000000000L; // L в конце для long
```

### Числа с плавающей точкой (дробные)

| Тип      | Размер  | Точность      | Пример                   |
| -------- | ------- | ------------- | ------------------------ |
| `float`  | 32 бита | ~7 знаков     | `float pi = 3.14f;`      |
| `double` | 64 бита | ~15-16 знаков | `double pi = 3.1415926;` |

**Примеры:**

```java
double price = 99.99;
double temperature = -15.5;
float weight = 75.3f; // f в конце для float
```

> 💡 **Важно:** По умолчанию все дробные числа в Java — это `double`. Для `float` нужно добавлять `f`.

### Логический тип

```java
boolean isAdult = true;
boolean isStudent = false;
boolean hasAccess = age >= 18;
```

Используется в условиях и логических выражениях.

### Символьный тип

```java
char letter = 'A';
char symbol = '$';
char digit = '7';
```

- Хранит **один символ**
- Всегда в **одинарных кавычках** `'A'`
- Поддерживает Unicode (можно хранить любые символы, включая русские: `'Ж'`)

### Сводная таблица примитивов

```java
// Целые числа
byte b = 100;
short s = 30000;
int i = 2000000;
long l = 10000000000L;

// Дробные числа
float f = 3.14f;
double d = 3.141592653589793;

// Логический
boolean flag = true;

// Символ
char ch = 'Z';
```

---

## 3. Переменные и операции

### Объявление и инициализация

```java
// Объявление без значения
int x;

// Инициализация (присвоение значения)
x = 10;

// Объявление с инициализацией
int y = 20;

// Константа (нельзя изменить)
final int DAYS_IN_WEEK = 7;
```

### Арифметические операции

```java
int a = 10;
int b = 3;

int sum = a + b;        // 13 - сложение
int diff = a - b;       // 7  - вычитание
int mult = a * b;       // 30 - умножение
int div = a / b;        // 3  - деление (целочисленное!)
int mod = a % b;        // 1  - остаток от деления

// Важно! Целочисленное деление
int result1 = 10 / 3;   // 3 (не 3.333...)
double result2 = 10.0 / 3; // 3.333...
```

### Операции инкремента и декремента

```java
int count = 5;

count++;  // увеличить на 1 (теперь count = 6)
count--;  // уменьшить на 1 (теперь count = 5)

// Сокращённые операции
count += 3;  // count = count + 3
count -= 2;  // count = count - 2
count *= 2;  // count = count * 2
count /= 2;  // count = count / 2
```

### Операции сравнения

```java
int x = 10;
int y = 20;

boolean isEqual = (x == y);      // false - равно
boolean notEqual = (x != y);     // true  - не равно
boolean greater = (x > y);       // false - больше
boolean less = (x < y);          // true  - меньше
boolean greaterEq = (x >= 10);   // true  - больше или равно
boolean lessEq = (y <= 15);      // false - меньше или равно
```

### Логические операции

```java
boolean a = true;
boolean b = false;

boolean and = a && b;  // false - логическое И (оба должны быть true)
boolean or = a || b;   // true  - логическое ИЛИ (хотя бы один true)
boolean not = !a;      // false - логическое НЕ (отрицание)

// Пример
int age = 20;
boolean isStudent = true;

if (age >= 18 && isStudent) {
    System.out.println("Совершеннолетний студент");
}
```

---

## 4. Условные конструкции

### Конструкция if-else

**Простое условие:**

```java
int age = 18;

if (age >= 18) {
    System.out.println("Вы совершеннолетний");
}
```

**С альтернативой (else):**

```java
if (age >= 18) {
    System.out.println("Вы совершеннолетний");
} else {
    System.out.println("Вы несовершеннолетний");
}
```

**Множественные условия (else if):**

```java
int score = 75;

if (score >= 90) {
    System.out.println("Отлично");
} else if (score >= 70) {
    System.out.println("Хорошо");
} else if (score >= 50) {
    System.out.println("Удовлетворительно");
} else {
    System.out.println("Неудовлетворительно");
}
```

> 💡 **Важно:** Проверка идёт **сверху вниз**. Как только нашлось подходящее условие — остальные не проверяются.

### Вложенные условия

```java
String login = "admin";
String password = "1234";

if (login.equals("admin")) {
    if (password.equals("1234")) {
        System.out.println("Доступ разрешён");
    } else {
        System.out.println("Неверный пароль");
    }
} else {
    System.out.println("Неверный логин");
}
```

### Оператор switch

Используется, когда нужно проверить **одну переменную на разные значения**.

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Понедельник");
        break;
    case 2:
        System.out.println("Вторник");
        break;
    case 3:
        System.out.println("Среда");
        break;
    case 4:
        System.out.println("Четверг");
        break;
    case 5:
        System.out.println("Пятница");
        break;
    default:
        System.out.println("Выходной");
}
```

**Важные моменты:**

- `break` — обязателен! Без него выполнение "провалится" в следующий case
- `default` — выполняется, если ни один case не подошёл

**Пример без break (провал):**

```java
int choice = 2;

switch (choice) {
    case 1:
        System.out.println("Один");
        // нет break!
    case 2:
        System.out.println("Два");
        // нет break!
    case 3:
        System.out.println("Три");
        break;
    default:
        System.out.println("Другое");
}

// Вывод: "Два" и "Три" (провалился в следующий case)
```

---

## 5. Циклы

Циклы позволяют **повторять действия** много раз.

### Цикл for

Используется, когда **заранее известно количество повторений**.

**Синтаксис:**

```java
for (инициализация; условие; шаг) {
    // тело цикла
}
```

**Примеры:**

```java
// Вывести числа от 1 до 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// Вывести чётные числа от 1 до 10
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}

// Сумма чисел от 1 до N
int N = 100;
int sum = 0;
for (int i = 1; i <= N; i++) {
    sum += i;
}
System.out.println("Сумма: " + sum); // 5050
```

**Цикл в обратном порядке:**

```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

### Цикл while

Проверяет условие **перед каждой итерацией**. Если условие ложно сразу — может не выполниться ни разу.

**Синтаксис:**

```java
while (условие) {
    // тело цикла
}
```

**Примеры:**

```java
int i = 1;
while (i <= 5) {
    System.out.println("i = " + i);
    i++;
}

// Ввод числа, пока не введено положительное
Scanner sc = new Scanner(System.in);
int num;

System.out.print("Введите положительное число: ");
num = sc.nextInt();

while (num <= 0) {
    System.out.print("Ошибка! Введите положительное число: ");
    num = sc.nextInt();
}

System.out.println("Вы ввели: " + num);
```

### Цикл do-while

Сначала **выполняет тело**, потом проверяет условие. Всегда выполняется **минимум один раз**.

**Синтаксис:**

```java
do {
    // тело цикла
} while (условие);
```

**Примеры:**

```java
int i = 1;
do {
    System.out.println("i = " + i);
    i++;
} while (i <= 5);

// Меню с выбором
Scanner sc = new Scanner(System.in);
int choice;

do {
    System.out.println("--- Меню ---");
    System.out.println("1. Создать");
    System.out.println("2. Изменить");
    System.out.println("3. Удалить");
    System.out.println("0. Выход");
    System.out.print("Ваш выбор: ");

    choice = sc.nextInt();

    switch (choice) {
        case 1:
            System.out.println("Создание...");
            break;
        case 2:
            System.out.println("Изменение...");
            break;
        case 3:
            System.out.println("Удаление...");
            break;
        case 0:
            System.out.println("До свидания!");
            break;
        default:
            System.out.println("Неверный выбор!");
    }
} while (choice != 0);
```

### Отличия while и do-while

| Параметр         | while                    | do-while                          |
| ---------------- | ------------------------ | --------------------------------- |
| Проверка условия | До выполнения тела       | После выполнения тела             |
| Минимум итераций | 0 (может не выполниться) | 1 (всегда выполнится хотя бы раз) |

### Управление циклом: break и continue

**break** — досрочный выход из цикла:

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // выход из цикла
    }
    System.out.println(i);
}
// Выведет: 1 2 3 4
```

**continue** — пропуск текущей итерации:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // пропустить 3
    }
    System.out.println(i);
}
// Выведет: 1 2 4 5
```

---

## 6. Массивы

### Что такое массив?

**Массив** — это структура данных для хранения нескольких значений **одного типа** под одним именем.

Каждый элемент имеет свой **индекс** (позицию). **Индексация начинается с 0!**

```text
Массив: [10, 20, 30, 40, 50]
Индексы: 0   1   2   3   4
```

### Создание массива

#### Способ 1: С инициализацией значений

```java
int[] numbers = {10, 20, 30, 40, 50};
```

#### Способ 2: С указанием размера

```java
int[] numbers = new int[5]; // массив из 5 элементов
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```

> ⚠️ Если не заполнить массив, в нём будут значения по умолчанию:
>
> - `0` для чисел
> - `false` для boolean
> - `null` для объектов

#### Способ 3: Массив других типов

```java
String[] names = {"Иван", "Мария", "Пётр"};
double[] prices = {99.99, 49.50, 199.00};
boolean[] flags = new boolean[3]; // false, false, false
```

### Доступ к элементам

```java
int[] numbers = {10, 20, 30, 40, 50};

System.out.println(numbers[0]); // 10
System.out.println(numbers[2]); // 30
System.out.println(numbers[4]); // 50

// Изменение элемента
numbers[2] = 999;
System.out.println(numbers[2]); // 999
```

### Длина массива

```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers.length); // 5

// Последний элемент
System.out.println(numbers[numbers.length - 1]); // 50
```

### Перебор массива: цикл for

**Классический for:**

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println("numbers[" + i + "] = " + numbers[i]);
}
```

**For-each (упрощённый):**

```java
for (int num : numbers) {
    System.out.println(num);
}
```

> 💡 **For-each** удобен, когда не нужен индекс.

### Практические задачи с массивами

#### Задача 1: Найти максимум

```java
int[] numbers = {15, 42, 8, 99, 23};
int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}

System.out.println("Максимум: " + max); // 99
```

#### Задача 2: Подсчитать сумму

```java
int[] numbers = {5, 10, 15, 20};
int sum = 0;

for (int num : numbers) {
    sum += num;
}

System.out.println("Сумма: " + sum); // 50
```

#### Задача 3: Вывести чётные элементы

```java
int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

for (int num : numbers) {
    if (num % 2 == 0) {
        System.out.print(num + " ");
    }
}
// Вывод: 2 4 6 8
```

### Вложенные циклы

**Вложенный цикл** — это когда один цикл находится внутри другого.

#### Пример: Таблица умножения

```java
for (int i = 1; i <= 5; i++) {           // внешний цикл — строки
    for (int j = 1; j <= 5; j++) {       // внутренний цикл — столбцы
        System.out.print((i * j) + "\t");
    }
    System.out.println(); // переход на новую строку
}
```

**Вывод:**

```text
1   2   3   4   5
2   4   6   8   10
3   6   9   12  15
4   8   12  16  20
5   10  15  20  25
```

**Пример: Рисование прямоугольника звёздочками**

```java
int height = 3;
int width = 5;

for (int i = 0; i < height; i++) {
    for (int j = 0; j < width; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

**Вывод:**

```text
* * * * *
* * * * *
* * * * *
```

---

## 7. Методы

### Зачем нужны методы?

Представь, что тебе нужно 10 раз в разных местах программы посчитать сумму двух чисел. Можно писать `a + b` каждый раз, а можно **один раз** создать метод и вызывать его.

**Методы помогают:**

- ✅ Избежать дублирования кода
- ✅ Разбить большую программу на части
- ✅ Сделать код читаемым и понятным
- ✅ Переиспользовать логику

### Структура метода

```java
модификатор_доступа static возвращаемый_тип имяМетода(параметры) {
    // тело метода
    return значение; // если метод что-то возвращает
}
```

**Разбор компонентов:**

- `модификатор_доступа` — `public`, `private` (кто может вызывать метод) - тебе не нужно
- `static` — метод принадлежит классу (пока всегда пишем) - тебе не нужно
- `возвращаемый_тип` — что метод возвращает (`int`, `String`, `void` и т.д.)
- `void` — метод ничего не возвращает, тип возвращаемого значения только для метода
- `имяМетода` — название метода (с маленькой буквы, camelCase)
- `параметры` — данные, которые передаём в метод

### Метод без параметров и без возврата (void)

```java
public static void sayHello() {
    System.out.println("Привет!");
}

// Вызов
public static void main(String[] args) {
    sayHello(); // Привет!
    sayHello(); // Привет!
}
```

### Метод с параметрами

```java
public static void greet(String name) {
    System.out.println("Привет, " + name + "!");
}

// Вызов
greet("Иван");  // Привет, Иван!
greet("Мария"); // Привет, Мария!
```

**Несколько параметров:**

```java
public static void printUserInfo(String name, int age) {
    System.out.println(name + " — " + age + " лет");
}

// Вызов
printUserInfo("Анна", 25); // Анна — 25 лет
```

### Метод с возвращаемым значением

```java
public static int sum(int a, int b) {
    return a + b;
}

// Вызов
int result = sum(10, 20);
System.out.println(result); // 30

// Или сразу в выводе
System.out.println(sum(5, 7)); // 12
```

**Важно:** Когда метод встречает `return` — он **немедленно завершается** и возвращает значение.

### Примеры методов

**Проверка на чётность:**

```java
public static boolean isEven(int n) {
    return n % 2 == 0;
}

// Использование
if (isEven(10)) {
    System.out.println("Чётное");
}
```

**Найти максимум из двух чисел:**

```java
public static int max(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

// Или короче
public static int maxShort(int a, int b) {
    return (a > b) ? a : b;
}
```

**Вычислить факториал:**

```java
public static long factorial(int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

System.out.println(factorial(5)); // 120 (5! = 1*2*3*4*5)
```

### Методы с массивами

**Принять массив, вернуть сумму:**

```java
public static int sumArray(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return sum;
}

// Использование
int[] numbers = {5, 10, 15, 20};
System.out.println(sumArray(numbers)); // 50
```

**Вернуть новый массив:**

```java
public static int[] doubleArray(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[i] * 2;
    }
    return result;
}

// Использование
int[] original = {1, 2, 3, 4};
int[] doubled = doubleArray(original);

for (int num : doubled) {
    System.out.print(num + " "); // 2 4 6 8
}
```

---

## 8. Строки (String)

### Что такое String?

`String` — это **объект** для работы с текстом. В отличие от примитивов (`int`, `boolean`), у `String` есть **методы**.

```java
String name = "Иван";
String message = "Привет, мир!";
```

> ⚠️ **Важно:** Строки в Java **неизменяемые** (immutable). Любой метод создаёт **новую строку**.

### Основные методы String

#### 1. Длина строки

```java
String word = "Hello";
System.out.println(word.length()); // 5
```

#### 2. Перевод регистра

```java
String word = "Java";
System.out.println(word.toUpperCase()); // "JAVA"
System.out.println(word.toLowerCase()); // "java"

// word всё ещё "Java" (строки неизменяемые!)
System.out.println(word); // "Java"

// Чтобы сохранить результат:
String upper = word.toUpperCase();
System.out.println(upper); // "JAVA"
```

#### 3. Проверка содержания подстроки

```java
String text = "Programming";
System.out.println(text.contains("gram")); // true
System.out.println(text.contains("test")); // false
```

#### 4. Сравнение строк

```java
String a = "Java";
String b = "java";

// НЕПРАВИЛЬНО: == сравнивает ссылки, не содержимое!
System.out.println(a == b); // может быть false

// ПРАВИЛЬНО: используй equals()
System.out.println(a.equals(b));           // false
System.out.println(a.equalsIgnoreCase(b)); // true (игнорирует регистр)
```

#### 5. Проверка начала и конца

```java
String url = "https://google.com";

System.out.println(url.startsWith("https")); // true
System.out.println(url.endsWith(".com"));    // true
```

#### 6. Замена символов/подстроки

```java
String text = "I like Java";
String newText = text.replace("Java", "Python");
System.out.println(newText); // "I like Python"

String phone = "8-800-555-35-35";
String clean = phone.replace("-", "");
System.out.println(clean); // "88005553535"
```

#### 7. Извлечение подстроки

```java
String text = "Hello, World!";
System.out.println(text.substring(0, 5));  // "Hello"
System.out.println(text.substring(7));     // "World!"
```

#### 8. Получить символ по индексу

```java
String word = "Java";
System.out.println(word.charAt(0)); // 'J'
System.out.println(word.charAt(3)); // 'a'
```

#### 9. Разделение строки

```java
String data = "Иван,25,Москва";
String[] parts = data.split(",");

System.out.println(parts[0]); // "Иван"
System.out.println(parts[1]); // "25"
System.out.println(parts[2]); // "Москва"
```

#### 10. Удаление пробелов

```java
String text = "   hello   ";
System.out.println(text.trim()); // "hello"
```

### Конкатенация строк

**Оператор +:**

```java
String first = "Hello";
String second = "World";
String result = first + " " + second;
System.out.println(result); // "Hello World"

// С числами
int age = 25;
String message = "Мне " + age + " лет";
System.out.println(message); // "Мне 25 лет"
```

**Метод concat():**

```java
String s1 = "Hello";
String s2 = "World";
String result = s1.concat(" ").concat(s2);
System.out.println(result); // "Hello World"
```

### Цепочка вызовов методов

```java
String name = "   ivan   ";
String fixed = name.trim().toUpperCase();
System.out.println(fixed); // "IVAN"

// Разбор:
// 1. name.trim() → "ivan"
// 2. "ivan".toUpperCase() → "IVAN"
```

---

## 9. Классы и объекты

### Зачем нужны классы?

До этого мы работали с отдельными переменными. Но представь, что ты пишешь программу для магазина. У каждого товара есть название, цена, количество.

**Без классов:**

```java
// Товар 1
String product1Name = "iPhone";
int product1Price = 50000;
int product1Quantity = 10;

// Товар 2
String product2Name = "MacBook";
int product2Price = 120000;
int product2Quantity = 5;

// Товар 3
String product3Name = "AirPods";
int product3Price = 15000;
int product3Quantity = 20;
```

**Проблемы:**

- 😵 Слишком много переменных
- 🤯 Сложно понять, что к чему относится
- 🚫 Невозможно легко добавить новый товар
- ❌ Данные не связаны логически

**С классами:**

```java
class Product {
    String name;
    int price;
    int quantity;
}

Product p1 = new Product();
p1.name = "iPhone";
p1.price = 50000;
p1.quantity = 10;

Product p2 = new Product();
p2.name = "MacBook";
p2.price = 120000;
p2.quantity = 5;
```

**Преимущества:**

- ✅ Все данные о товаре в одном месте
- ✅ Легко создавать новые товары
- ✅ Код читаемый и структурированный
- ✅ Можно добавлять методы

### Что такое класс и объект?

**Класс** — это **шаблон** (чертёж), который описывает:

- Какие **данные** (поля) есть у объекта
- Что объект **умеет делать** (методы)

**Объект** — это **конкретный экземпляр** класса со своими значениями полей.

**Аналогия из жизни:**

> **Класс** — это план дома (чертёж). На нём написано: должна быть кухня, спальня, ванная.
>
> **Объект** — это конкретный дом, построенный по этому плану. У него есть адрес, цвет стен, жильцы.

### Создание класса

```java
class Car {
    // Поля (характеристики)
    String model;
    String color;
    int year;

    // Методы (действия)
    void start() {
        System.out.println(model + " завелась");
    }

    void stop() {
        System.out.println(model + " остановилась");
    }

    void displayInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Цвет: " + color);
        System.out.println("Год: " + year);
    }
}
```

### Создание объекта

```java
public class Main {
    public static void main(String[] args) {
        // Создание объекта
        Car myCar = new Car();

        // Установка значений полей
        myCar.model = "BMW X5";
        myCar.color = "Чёрный";
        myCar.year = 2023;

        // Вызов методов
        myCar.displayInfo();
        myCar.start();
        myCar.stop();
    }
}
```

**Вывод:**

```text
Модель: BMW X5
Цвет: Чёрный
Год: 2023
BMW X5 завелась
BMW X5 остановилась
```

### Несколько объектов одного класса

```java
Car car1 = new Car();
car1.model = "BMW";
car1.color = "Чёрный";

Car car2 = new Car();
car2.model = "Mercedes";
car2.color = "Белый";

Car car3 = new Car();
car3.model = "Audi";
car3.color = "Серебристый";

car1.start(); // BMW завелась
car2.start(); // Mercedes завелась
car3.start(); // Audi завелась
```

### Методы в классах

**Метод без параметров:**

```java
class Student {
    String name;
    int age;

    void sayHello() {
        System.out.println("Привет! Меня зовут " + name);
    }
}

Student s = new Student();
s.name = "Иван";
s.sayHello(); // Привет! Меня зовут Иван
```

**Метод с параметрами:**

```java
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

Calculator calc = new Calculator();
System.out.println(calc.sum(5, 10));      // 15
System.out.println(calc.multiply(4, 7));  // 28
```

**Метод, изменяющий поля объекта:**

```java
class BankAccount {
    String owner;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнено на " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снято " + amount);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    void showBalance() {
        System.out.println("Баланс: " + balance);
    }
}

BankAccount acc = new BankAccount();
acc.owner = "Иван";
acc.balance = 1000;

acc.showBalance();   // Баланс: 1000.0
acc.deposit(500);    // Пополнено на 500.0
acc.showBalance();   // Баланс: 1500.0
acc.withdraw(200);   // Снято 200.0
acc.showBalance();   // Баланс: 1300.0
```

### Полный пример: класс Person

```java
class Person {
    // Поля
    String name;
    int age;
    String city;

    // Методы
    void introduce() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет, я из " + city);
    }

    void haveBirthday() {
        age++;
        System.out.println("С днём рождения! Теперь мне " + age);
    }

    boolean isAdult() {
        return age >= 18;
    }
}

// Использование
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Иван";
        p1.age = 25;
        p1.city = "Москва";

        Person p2 = new Person();
        p2.name = "Мария";
        p2.age = 17;
        p2.city = "Санкт-Петербург";

        p1.introduce(); // Меня зовут Иван, мне 25 лет, я из Москва
        p2.introduce(); // Меня зовут Мария, мне 17 лет, я из Санкт-Петербург

        p1.haveBirthday(); // С днём рождения! Теперь мне 26

        System.out.println(p1.isAdult()); // true
        System.out.println(p2.isAdult()); // false
    }
}
```

---

## 10. Практические советы

### Правила именования

```java
// Классы: PascalCase (с большой буквы)
class BankAccount { }
class UserProfile { }

// Переменные и методы: camelCase (с маленькой буквы)
int userAge = 25;
String firstName = "Иван";
void calculateSum() { }

// Константы: UPPER_CASE
final int MAX_SIZE = 100;
final double PI = 3.14159;
```

### Частые ошибки новичков

**1. Забыть точку с запятой**

```java
int x = 10  // ОШИБКА!
int y = 20; // ПРАВИЛЬНО
```

**2. Перепутать == и =**

```java
int x = 5;
if (x = 10) { } // ОШИБКА! (присвоение вместо сравнения)
if (x == 10) { } // ПРАВИЛЬНО
```

**3. Сравнивать строки через ==**

```java
String a = "Java";
String b = "Java";

if (a == b) { }        // НЕПРАВИЛЬНО (может не работать)
if (a.equals(b)) { }   // ПРАВИЛЬНО
```

**4. Выход за границы массива**

```java
int[] arr = {1, 2, 3};
System.out.println(arr[5]); // ОШИБКА! ArrayIndexOutOfBoundsException
System.out.println(arr[2]); // ПРАВИЛЬНО
```

**5. Забыть про индексацию с 0**

```java
int[] arr = {10, 20, 30};
// arr[0] = 10
// arr[1] = 20
// arr[2] = 30
// arr[3] = НЕТ ТАКОГО ЭЛЕМЕНТА!
```

### Как читать ошибки компилятора

```text
Error: variable x might not have been initialized
```

→ Переменная `x` не инициализирована (нет значения)

```text
Error: cannot find symbol
```

→ Переменная или метод не найдены (проверь имя)

```text
Error: incompatible types
```

→ Несовместимые типы (например, пытаешься записать String в int)

```text
ArrayIndexOutOfBoundsException
```

→ Выход за границы массива

### Советы по стилю кода

**1. Отступы и форматирование:**

```java
// Плохо
public static void main(String[]args){
int x=5;
if(x>0){
System.out.println("Positive");
}
}

// Хорошо
public static void main(String[] args) {
    int x = 5;
    if (x > 0) {
        System.out.println("Positive");
    }
}
```

**2. Осмысленные имена:**

```java
// Плохо
int a = 25;
String s = "Ivan";

// Хорошо
int userAge = 25;
String userName = "Ivan";
```

**3. Комментарии:**

```java
// Вычисляем сумму элементов массива
int sum = 0;
for (int num : numbers) {
    sum += num;
}
```

## 📝 Итоговая шпаргалка

### Типы данных

```java
// Целые числа
byte b = 100;     // -128...127
short s = 30000;  // -32768...32767
int i = 100000;   // -2млрд...+2млрд
long l = 10000L;  // очень большие числа

// Дробные
float f = 3.14f;
double d = 3.14159;

// Другие
boolean flag = true;
char c = 'A';
String text = "Hello";
```

### Операторы

```java
// Арифметика
+ - * / %
++ --

// Сравнение
== != > < >= <=

// Логические
&& || !
```

### Условия

```java
if (условие) { }
else if (условие) { }
else { }

switch (переменная) {
    case значение1: ...; break;
    case значение2: ...; break;
    default: ...;
}
```

### Циклы

```java
for (int i = 0; i < 10; i++) { }

while (условие) { }

do { } while (условие);

for (int num : array) { }
```

### Массивы

```java
int[] arr = {1, 2, 3, 4, 5};
int[] arr = new int[10];

arr[0] = 100;
int len = arr.length;
```

### Методы

```java
public static void methodName() { }
public static int sum(int a, int b) { return a + b; }
```

### Классы

```java
class ClassName {
    // Поля
    String field;
    int number;

    // Методы
    void method() { }
}

ClassName obj = new ClassName();
obj.field = "value";
```

---

## 11. Вопросы для самопроверки

### Базовые концепции (1-10)

1. Что такое Java и в чём её главная особенность?
2. Что такое JVM и зачем она нужна?
3. Как называется главный метод в Java, с которого начинается выполнение программы?
4. Почему имя файла должно совпадать с именем класса?
5. В чём разница между `System.out.println()` и `System.out.print()`?
6. Сколько примитивных типов данных в Java?
7. Какой примитивный тип используется для целых чисел по умолчанию?
8. Чем отличается `int` от `long`?
9. Чем отличается `float` от `double`?
10. Что будет, если не инициализировать переменную перед использованием?

### Операции и условия (11-20)

11. В чём разница между `=` и `==`?
12. Что вернёт выражение `10 / 3`, если оба числа типа `int`?
13. Что делает оператор `%` (остаток от деления)?
14. Что делают операторы `&&` и `||`?
15. В каком порядке проверяются условия в конструкции `if - else if - else`?
16. Для чего используется оператор `switch`?
17. Что произойдёт, если забыть написать `break` в `switch`?
18. Что такое тернарный оператор? Приведи пример.\*
19. Можно ли сравнивать строки через `==`? Почему?\*
20. Как правильно сравнивать строки в Java?

### Циклы (21-25)

21. В чём разница между циклами `while` и `do-while`?
22. Когда используется цикл `for`, а когда `while`?
23. Что делает оператор `break` в цикле?\*
24. Что делает оператор `continue` в цикле?\*
25. Что такое вложенные циклы? Приведи пример использования.

### Массивы (26-30)

26. С какого индекса начинается нумерация элементов массива?
27. Как узнать длину массива?
28. Что будет в массиве `int[]`, если его создать, но не заполнить значениями?
29. Какая ошибка возникнет, если обратиться к несуществующему индексу массива?
30. В чём разница между обычным циклом `for` и циклом `for-each`?

### Методы (31-35)

31. Зачем нужны методы?
32. Что означает ключевое слово `void` в объявлении метода?
33. Что такое параметры метода?
34. Что делает ключевое слово `return`?
35. Можно ли из метода вернуть массив?

### Строки (36-40)

36. Почему нельзя сравнивать строки через `==`?
37. Какой метод используется для получения длины строки?
38. Что вернёт метод `"Hello".toUpperCase()`?
39. Что делает метод `trim()`?
40. Чем отличается `charAt()` от `substring()`?

### Классы и объекты (41-50)

41. Что такое класс?
42. Что такое объект?
43. В чём разница между классом и объектом?
44. Что такое поля класса?
45. Как создать объект класса?
46. Как обратиться к полю объекта?
47. Как вызвать метод объекта?
48. Можно ли создать несколько объектов одного класса?
49. Зачем объединять данные и методы в одном классе?
50. Что такое `new` и для чего оно используется?

---
