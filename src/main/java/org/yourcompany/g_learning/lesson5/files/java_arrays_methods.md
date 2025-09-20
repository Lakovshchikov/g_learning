# 📑 Лекция: Методы и работа с массивами в Java

## 🔹 Что такое массив

- **Массив** — структура данных, которая хранит набор элементов **одного типа**.
- Каждый элемент доступен по индексу (нумерация начинается с `0`).
- У массива есть **длина** (количество элементов).

### Пример объявления массива:

```java
int[] numbers = new int[5];   // массив из 5 чисел (по умолчанию все 0)
numbers[0] = 10;              // первый элемент
numbers[1] = 20;              // второй элемент
System.out.println(numbers[0]); // 10
```

### Краткая форма:

```java
int[] nums = {1, 2, 3, 4, 5}; // массив сразу с элементами
System.out.println(nums[2]);  // 3 (третий элемент)
```

---

## 🔹 Длина массива

- У массива есть поле `.length` (не метод!).
- Оно показывает количество элементов.

```java
int[] nums = {10, 20, 30};
System.out.println(nums.length); // 3
```

---

## 🔹 Перебор массива с помощью циклов

### Через `for`

```java
int[] nums = {5, 10, 15};
for (int i = 0; i < nums.length; i++) {
    System.out.println("Элемент " + i + ": " + nums[i]);
}
```

### Через `while`

```java
int[] nums = {5, 10, 15};
int i = 0;
while (i < nums.length) {
    System.out.println(nums[i]);
    i++;
}
```

---

## 🔹 Массивы и строки

Строку можно превратить в массив символов или разбить по словам.

```java
String text = "Java is fun";
char[] chars = text.toCharArray();     // массив символов
String[] words = text.split(" ");      // массив строк

System.out.println(chars[0]);          // 'J'
System.out.println(words[1]);          // "is"
```

---

## 🔹 Класс `Arrays`

Java предоставляет утилитный класс `Arrays` с множеством методов для работы с массивами.  
Чтобы использовать их, нужно импортировать:

```java
import java.util.Arrays;
```

---

## 🔹 Основные методы `Arrays`

### 1. `Arrays.toString(array)`

Преобразует массив в строку (удобно для вывода).

```java
int[] nums = {1, 2, 3};
System.out.println(Arrays.toString(nums)); // [1, 2, 3]
```

---

### 2. `Arrays.sort(array)`

Сортирует массив по возрастанию.

```java
int[] nums = {5, 1, 4, 2};
Arrays.sort(nums);
System.out.println(Arrays.toString(nums)); // [1, 2, 4, 5]
```

---

### 3. `Arrays.binarySearch(array, key)`

Ищет элемент в отсортированном массиве.  
Возвращает индекс элемента или отрицательное значение, если не найден.

```java
int[] nums = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(nums, 3);
System.out.println(index); // 2
```

---

### 4. `Arrays.equals(array1, array2)`

Сравнивает два массива поэлементно.

```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
System.out.println(Arrays.equals(a, b)); // true
```

---

### 5. `Arrays.fill(array, value)`

Заполняет весь массив указанным значением.

```java
int[] arr = new int[5];
Arrays.fill(arr, 7);
System.out.println(Arrays.toString(arr)); // [7, 7, 7, 7, 7]
```

---

### 6. `Arrays.copyOf(array, newLength)`

Создаёт новый массив с указанной длиной, копируя элементы из исходного.

```java
int[] nums = {1, 2, 3};
int[] copy = Arrays.copyOf(nums, 5);
System.out.println(Arrays.toString(copy)); // [1, 2, 3, 0, 0]
```

---

### 7. `Arrays.copyOfRange(array, from, to)`

Копирует часть массива (от `from` включительно до `to` не включительно).

```java
int[] nums = {10, 20, 30, 40, 50};
int[] part = Arrays.copyOfRange(nums, 1, 4);
System.out.println(Arrays.toString(part)); // [20, 30, 40]
```

---

## 🔹 Многомерные массивы

### Создание двумерного массива

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println(matrix[1][2]); // 6 (вторая строка, третий столбец)
```

### Вывод двумерного массива

```java
System.out.println(Arrays.deepToString(matrix));
// [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
```

---

## 📌 Итог

- Массив = набор элементов одного типа.
- У массива есть длина `.length`.
- Для работы с массивами полезен класс `Arrays`: `toString`, `sort`, `binarySearch`, `equals`, `fill`, `copyOf`, `copyOfRange`.
- Для двумерных массивов используется `Arrays.deepToString`.
- Массивы удобно комбинировать с циклами, строками и утилитными методами.
