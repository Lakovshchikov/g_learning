# 📚 Шпаргалка по синтаксису Java

Шпаргалка с описанием синтаксиса, примерами и пояснениями по ключевым конструкциям.

---

## 1) Структура программы: класс и `main`

**Описание:**

- `class` — ключевое слово для объявления класса.
- `public static void main(String[] args)` — точка входа программы.
- Внутри фигурных скобок `{}` — блок кода.

```java
public class App { // объявление публичного класса с именем App
    public static void main(String[] args) { // главный метод — начало выполнения программы
        System.out.println("Hello"); // оператор вывода
    } // конец метода main
} // конец класса
```

---

## 2) Условие `if`

**Описание:**

- `if` — ключевое слово.
- `(условие)` — логическое выражение, возвращающее `true` или `false`.
- `{ тело }` — блок кода, который выполняется, если условие истинно.

```java
int age = 18;

if (age >= 18) {             // if — проверяем условие (age >= 18)
    System.out.println("Взрослый"); // тело условия выполняется, если условие true
}
```

**С else if / else:**

- `else if` — дополнительная проверка, если предыдущее условие ложно.
- `else` — блок, выполняющийся, если все условия выше ложны.

```java
if (age >= 65) {
    System.out.println("Пожилой");
} else if (age >= 18) {
    System.out.println("Взрослый");
} else {
    System.out.println("Несовершеннолетний");
}
```

---

## 3) Оператор выбора `switch`

**Описание:**

- `switch (выражение)` — оператор выбора.
- `case` — отдельный вариант.
- `break` — завершает выполнение внутри switch.
- `default` — выполняется, если ни один case не подошёл.

```java
int choice = 2;

switch (choice) {         // switch — выбор по значению переменной choice
    case 1:               // case — вариант
        System.out.println("Создать");
        break;            // break — выход из switch
    case 2:
        System.out.println("Запустить");
        break;
    default:              // default — если ни один вариант не совпал
        System.out.println("Неизвестно");
}
```

---

## 4) Цикл `while`

**Описание:**

- `while` — ключевое слово.
- `(условие)` — проверяется перед каждой итерацией.
- `{ тело }` — блок повторяется, пока условие истинно.

```java
int i = 1;

while (i <= 5) {                // while — пока условие true
    System.out.println(i);      // тело цикла
    i++;                        // шаг — иначе будет бесконечный цикл
}
```

---

## 5) Цикл `do while`

**Описание:**

- `do` — начало блока цикла.
- `{ тело }` — блок выполняется минимум один раз.
- `while (условие);` — проверка в конце.

```java
int n = 0;

do {                               // do — выполняем тело
    System.out.println("n = " + n);
    n++;
} while (n < 3);                   // while — проверка в конце
```

---

## 6) Цикл `for`

**Описание:**

- `for (инициализация; условие; шаг)` — три части цикла.
  - инициализация: выполняется один раз перед началом;
  - условие: проверяется перед каждой итерацией;
  - шаг: выполняется после каждой итерации.

```java
for (int j = 1; j <= 5; j++) { // int j=1 — инициализация; j<=5 — условие; j++ — шаг
    System.out.println(j);     // тело цикла
}
```

---

## 7) Массивы

**Описание:**

- `тип[] имя = new тип[размер];` — создание нового массива.
- `имя[индекс]` — доступ к элементу по индексу (начиная с 0).
- `имя [индекс]` = переменная, которая лежит в массиве по определенному индексу ( индексам)
- `.length` — поле, показывающее длину массива.

```java
int[] arr = new int[3];   // массив из 3 чисел: [0, 0, 0]
arr[0] = 10;              // запись по индексу
arr[1] = 20;
arr[2] = 30;
System.out.println(arr[0]); // чтение → 10
System.out.println(arr.length); // длина массива
```

---

## 8) Работа со строками

**Описание:**

- `String` — объект для работы с текстом.
- Методы вызываются через точку `.`.
- Строки неизменяемые.

```java
String s = " Java ";

System.out.println(s.length());          // длина строки
System.out.println(s.trim());            // убираем пробелы
System.out.println(s.toUpperCase());     // верхний регистр
System.out.println(s.toLowerCase());     // нижний регистр
System.out.println(s.contains("av"));    // содержит подстроку?
System.out.println(s.equals("Java"));    // сравнение строк
System.out.println(s.equalsIgnoreCase("java")); // сравнение без учёта регистра
```

---

## 9) Утилиты `Arrays`

**Описание:**  
Класс `Arrays` содержит статические методы для работы с массивами.

```java
import java.util.Arrays;

int[] arr = {5, 1, 4, 2};

System.out.println(Arrays.toString(arr));  // преобразование в строку
Arrays.sort(arr);                           // сортировка
System.out.println(Arrays.toString(arr));  // [1, 2, 4, 5]

int pos = Arrays.binarySearch(arr, 4);      // бинарный поиск
System.out.println(pos);                    // индекс элемента

int[] copy = Arrays.copyOf(arr, 6);         // копия массива с новой длиной
System.out.println(Arrays.toString(copy));

int[] part = Arrays.copyOfRange(arr, 1, 3); // часть массива
System.out.println(Arrays.toString(part));

int[] filled = new int[4];
Arrays.fill(filled, 7);                     // заполнение значением
System.out.println(Arrays.toString(filled));

int[][] matrix = {{1,2}, {3,4}};
System.out.println(Arrays.deepToString(matrix)); // двумерный массив
```

---

## 10) Комментарии

**Описание:**  
Комментарии не выполняются, а нужны только для программиста.

```java
// Однострочный комментарий

/*
 Многострочный
 комментарий
*/
```

---

## 📌 Чек-лист

- `if` — условие → `boolean выражение`.
- `switch` — выбор по значению переменной.
- Циклы: `while` (проверка в начале), `do while` (проверка в конце), `for` (инициализация; условие; шаг).
- Массивы: фиксированная длина, доступ по индексу, `.length`.
- Строки (`String`) — объект, методы: `length`, `trim`, `toUpperCase`, `equals`.
- `Arrays` — утилиты: `toString`, `sort`, `binarySearch`, `equals`, `copyOf`, `fill`.
