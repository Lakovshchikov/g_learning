# 🏗️ Лекция: Конструкторы, this и модификаторы доступа

## 📋 Содержание

1. [Конструкторы](#1-конструкторы)
2. [Ключевое слово this](#2-ключевое-слово-this)
3. [Модификаторы доступа](#3-модификаторы-доступа)
4. [Практические задачи](#4-практические-задачи)
5. [Вопросы для самопроверки](#5-вопросы-для-самопроверки)

---

## 1. Конструкторы

### Что такое конструктор?

**Конструктор** — это специальный метод, который вызывается **автоматически** при создании объекта с помощью ключевого слова `new`.

**Зачем нужны конструкторы?**

Представь, что у тебя класс `Car` с полями `model`, `color`, `year`. Без конструктора приходится делать так:

```java
Car car = new Car();
car.model = "BMW";
car.color = "Чёрный";
car.year = 2023;
```

Это неудобно и можно забыть установить какое-то поле. **Конструктор** решает эту проблему — он позволяет задать все значения **сразу при создании объекта**:

```java
Car car = new Car("BMW", "Чёрный", 2023);
```

### Правила написания конструктора

1. **Имя конструктора совпадает с именем класса**
2. **У конструктора НЕТ типа возвращаемого значения** (даже `void` не пишется)
3. Конструктор вызывается **автоматически** при создании объекта через `new`

**Синтаксис:**

```java
class ИмяКласса {
    // Поля

    // Конструктор
    ИмяКласса(параметры) {
        // инициализация полей
    }
}
```

### Конструктор по умолчанию

Если ты **не написал** ни одного конструктора, Java автоматически создаёт **конструктор по умолчанию** (пустой):

```java
class Book {
    String title;
    String author;
    int year;

    // Java автоматически добавит:
    // Book() { }
}

// Поэтому можно создать объект
Book book = new Book();
```

⚠️ **Важно:** Как только ты создаёшь **свой конструктор**, конструктор по умолчанию **перестаёт существовать**!

```java
class Book {
    String title;
    String author;
    int year;

    // Свой конструктор
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

// Теперь НЕЛЬЗЯ создать объект без параметров!
Book book = new Book(); // ОШИБКА!

// Нужно обязательно передать параметры:
Book book = new Book("1984", "George Orwell", 1949); // ✅
```

### Примеры конструкторов

#### Пример 1: Простой конструктор

```java
class Student {
    String name;
    int age;

    // Конструктор
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void printInfo() {
        System.out.println(name + " - " + age + " лет");
    }
}

// Использование
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", 20);
        Student student2 = new Student("Мария", 22);

        student1.printInfo(); // Иван - 20 лет
        student2.printInfo(); // Мария - 22 лет
    }
}
```

#### Пример 2: Конструктор с проверками

```java
class BankAccount {
    String owner;
    double balance;

    // Конструктор с валидацией
    BankAccount(String owner, double initialBalance) {
        this.owner = owner;

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Ошибка: баланс не может быть отрицательным!");
            this.balance = 0;
        }
    }

    void showBalance() {
        System.out.println(owner + " имеет на счёте: " + balance + " руб.");
    }
}

// Использование
BankAccount acc1 = new BankAccount("Иван", 5000);  // ✅
BankAccount acc2 = new BankAccount("Мария", -100); // ⚠️ установит 0

acc1.showBalance(); // Иван имеет на счёте: 5000.0 руб.
acc2.showBalance(); // Мария имеет на счёте: 0.0 руб.
```

### Перегрузка конструкторов

В классе может быть **несколько конструкторов** с разным набором параметров. Это называется **перегрузка конструкторов**.

```java
class Product {
    String name;
    double price;
    int quantity;

    // Конструктор 1: все параметры
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Конструктор 2: без количества (по умолчанию 1)
    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    // Конструктор 3: только название (цена 0, количество 1)
    Product(String name) {
        this.name = name;
        this.price = 0;
        this.quantity = 1;
    }

    void printInfo() {
        System.out.println(name + " - " + price + " руб. x " + quantity);
    }
}

// Использование
Product p1 = new Product("Laptop", 50000, 5);
Product p2 = new Product("Mouse", 1500);
Product p3 = new Product("Keyboard");

p1.printInfo(); // Laptop - 50000.0 руб. x 5
p2.printInfo(); // Mouse - 1500.0 руб. x 1
p3.printInfo(); // Keyboard - 0.0 руб. x 1
```

---

## 2. Ключевое слово this

### Что такое this?

`this` — это **ссылка на текущий объект**, с которым мы сейчас работаем.

**Зачем нужен `this`?**

### Проблема 1: Совпадение имён параметров и полей

```java
class Person {
    String name;
    int age;

    // Без this - проблема!
    Person(String name, int age) {
        name = name;  // ❌ Параметр присваивается сам себе!
        age = age;    // ❌ Поле класса остаётся неинициализированным!
    }
}
```

В этом примере Java **не понимает**, что ты хочешь присвоить полю класса значение параметра. Она думает, что ты присваиваешь параметр сам себе.

**Решение — использовать `this`:**

```java
class Person {
    String name;
    int age;

    // С this - всё правильно!
    Person(String name, int age) {
        this.name = name;  // ✅ this.name - это поле класса
        this.age = age;    // ✅ age (справа) - это параметр
    }
}
```

**Разбор:**

- `this.name` — поле объекта
- `name` (справа от `=`) — параметр конструктора

### Использование this в методах

`this` можно использовать в **любом методе** класса, чтобы явно указать, что мы обращаемся к полю объекта:

```java
class User {
    String username;
    String email;

    User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    void changeEmail(String email) {
        this.email = email;  // this.email - поле, email - параметр
        System.out.println("Email изменён на: " + this.email);
    }

    void printInfo() {
        System.out.println("Пользователь: " + this.username);
        System.out.println("Email: " + this.email);
    }
}

// Использование
User user = new User("ivan123", "ivan@mail.com");
user.printInfo();
// Пользователь: ivan123
// Email: ivan@mail.com

user.changeEmail("newemail@mail.com");
// Email изменён на: newemail@mail.com

user.printInfo();
// Пользователь: ivan123
// Email: newemail@mail.com
```

## 3. Модификаторы доступа

### Что такое модификаторы доступа?

**Модификаторы доступа** управляют **видимостью** полей и методов класса. Они определяют, откуда можно обращаться к полю или методу.

В Java есть 4 модификатора доступа, но мы изучим два основных:

- `public` — **публичный**, доступен отовсюду
- `private` — **приватный**, доступен только внутри класса

### Модификатор public

`public` означает, что поле или метод **доступен из любого места** программы.

```java
class Person {
    public String name;  // Публичное поле
    public int age;      // Публичное поле

    public Person(String name, int age) {  // Публичный конструктор
        this.name = name;
        this.age = age;
    }

    public void printInfo() {  // Публичный метод
        System.out.println(name + " - " + age + " лет");
    }
}

// Использование
Person person = new Person("Иван", 25);
System.out.println(person.name);  // ✅ Доступ есть
person.age = 30;                  // ✅ Можем изменить
person.printInfo();               // ✅ Можем вызвать
```

### Модификатор private

`private` означает, что поле или метод **доступен только внутри класса**. Снаружи к нему обратиться **нельзя**.

```java
class BankAccount {
    private String owner;    // Приватное поле
    private double balance;  // Приватное поле

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Приватный метод (используется только внутри класса)
    private boolean isValidAmount(double amount) {
        return amount > 0;
    }

    // Публичный метод для пополнения счёта
    public void deposit(double amount) {
        if (isValidAmount(amount)) {  // Вызываем приватный метод
            this.balance += amount;
            System.out.println("Пополнено на " + amount + " руб.");
        } else {
            System.out.println("Ошибка: неверная сумма!");
        }
    }

    // Публичный метод для получения баланса
    public double getBalance() {
        return this.balance;
    }
}

// Использование
BankAccount acc = new BankAccount("Иван", 5000);

System.out.println(acc.owner);     // ❌ ОШИБКА! owner - private
System.out.println(acc.balance);   // ❌ ОШИБКА! balance - private
acc.isValidAmount(100);            // ❌ ОШИБКА! isValidAmount - private

acc.deposit(1000);                 // ✅ deposit - public
System.out.println(acc.getBalance()); // ✅ getBalance - public
```

### Зачем нужен private?

Когда поля класса `public`, любой может их изменить как угодно. Это может привести к ошибкам и некорректным данным.

**Проблема без `private`:**

```java
class BankAccount {
    public String owner;
    public double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
}

// Проблема: можно изменить баланс напрямую!
BankAccount acc = new BankAccount("Иван", 5000);
acc.balance = 1000000;  // 😈 Неправильно! Баланс изменён без проверок
acc.balance = -500;     // 😱 Баланс стал отрицательным!
```

**Решение с `private`:**

Мы **прячем** данные внутри класса и разрешаем изменять их **только через специальные методы**, где можем добавить проверки.

````java
class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Пополнить счёт (с проверкой)
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Пополнено на " + amount + " руб.");
        } else {
            System.out.println("Ошибка: сумма должна быть положительной!");
        }
    }

    // Снять деньги (с проверкой)
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Снято " + amount + " руб.");
            return true;
        } else {
            System.out.println("Ошибка: недостаточно средств или неверная сумма!");
            return false;
        }
    }

    // Получить баланс
    public double getBalance() {
        return this.balance;
    }
}

// Теперь безопасно
BankAccount acc = new BankAccount("Иван", 5000);
acc.balance = 1000000;  // ❌ ОШИБКА! balance - private, нельзя изменить напрямую
acc.deposit(1000);      // ✅ Только через метод с проверкой
acc.withdraw(200);      // ✅ Снятие с проверкой
```### Геттеры и сеттеры

Когда поля `private`, мы не можем обратиться к ним напрямую извне класса. Чтобы **получить** или **изменить** значение приватного поля, используют специальные методы:

- **Геттер** (getter) — метод для **получения** значения поля
- **Сеттер** (setter) — метод для **изменения** значения поля

**Зачем это нужно?**

Представь, что у тебя класс `Student` с полем `age` (возраст). Если поле `public`, кто угодно может написать:

```java
student.age = -100;  // 😱 Отрицательный возраст!
student.age = 500;   // 😱 Нереальный возраст!
````

С `private` и сеттером мы можем **проверить** данные перед изменением:

**Правила именования:**

- Геттер: `getИмяПоля()` — возвращает значение
- Сеттер: `setИмяПоля(значение)` — устанавливает значение

**Пример:**

```java
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для name — просто возвращает значение
    public String getName() {
        return this.name;
    }

    // Сеттер для name — изменяет значение
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для age
    public int getAge() {
        return this.age;
    }

    // Сеттер для age с проверкой!
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("Ошибка: возраст должен быть от 1 до 149!");
        }
    }
}

// Использование
Student student = new Student("Иван", 20);

// Получаем значения через геттеры
System.out.println(student.getName());  // Иван
System.out.println(student.getAge());   // 20

// Изменяем через сеттеры
student.setName("Пётр");
student.setAge(22);

System.out.println(student.getName());  // Пётр
System.out.println(student.getAge());   // 22

// Пытаемся установить неправильный возраст
student.setAge(-5);   // Ошибка: возраст должен быть от 1 до 149!
student.setAge(200);  // Ошибка: возраст должен быть от 1 до 149!
```

**Что происходит:**

1. Поля `name` и `age` — `private`, к ним нельзя обратиться напрямую
2. Чтобы **прочитать** значение — вызываем геттер: `student.getName()`
3. Чтобы **изменить** значение — вызываем сеттер: `student.setName("Пётр")`
4. В сеттере можем добавить **проверку**, чтобы не допустить некорректные данные

### Полный пример: класс Book с инкапсуляцией

```java
class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    // Конструктор
    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.setPrice(price);  // Используем сеттер с проверкой
    }

    // Геттеры
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }

    // Сеттеры
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Ошибка: цена не может быть отрицательной!");
            this.price = 0;
        }
    }

    // Приватный метод для форматирования
    private String formatPrice() {
        return String.format("%.2f руб.", this.price);
    }

    // Публичный метод для вывода информации
    public void printInfo() {
        System.out.println("\"" + this.title + "\" - " + this.author +
                           " (" + this.year + "), цена: " + formatPrice());
    }
}

// Использование
public class Main {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 1949, 599.99);

        book.printInfo();
        // "1984" - George Orwell (1949), цена: 599.99 руб.

        book.setPrice(499.99);
        book.printInfo();
        // "1984" - George Orwell (1949), цена: 499.99 руб.

        book.setPrice(-100);  // Ошибка: цена не может быть отрицательной!
    }
}
```

---

## 4. Практические задачи

### Задача 1: Класс "Точка на плоскости"

Создай класс `Point` с полями `x` и `y` (координаты точки).

**Требования:**

1. Поля должны быть `private`
2. Создай конструктор, который принимает `x` и `y`
3. Создай конструктор без параметров (точка в начале координат 0, 0)
4. Добавь геттеры для `x` и `y`
5. Добавь метод `printInfo()`, который выводит координаты в формате: `(x, y)`
6. Добавь метод `distanceToOrigin()`, который возвращает расстояние от точки до начала координат (формула: `√(x² + y²)`)

**Подсказка:** Для вычисления квадратного корня используй `Math.sqrt()`, для возведения в квадрат — `Math.pow(число, 2)`

**Пример использования:**

```java
Point p1 = new Point(3, 4);
Point p2 = new Point();

p1.printInfo();  // (3, 4)
p2.printInfo();  // (0, 0)

System.out.println(p1.distanceToOrigin());  // 5.0
```

---

### Задача 2: Класс "Товар в магазине"

Создай класс `Product` для интернет-магазина.

**Требования:**

1. Поля (все `private`):

   - `name` (название товара)
   - `price` (цена)
   - `quantity` (количество на складе)

2. Конструкторы:

   - С тремя параметрами: `name`, `price`, `quantity`
   - С двумя параметрами: `name`, `price` (количество по умолчанию = 0)

3. Геттеры для всех полей

4. Сеттеры:

   - `setPrice(double price)` — цена должна быть >= 0
   - `setQuantity(int quantity)` — количество должно быть >= 0

5. Методы:
   - `addStock(int amount)` — добавить товар на склад
   - `sellProduct(int amount)` — продать товар (уменьшить количество). Вернуть `true`, если продажа успешна, иначе `false`
   - `getTotalValue()` — вернуть общую стоимость товара на складе (цена × количество)
   - `printInfo()` — вывести информацию о товаре

**Пример использования:**

```java
Product product = new Product("Laptop", 50000, 10);

product.printInfo();
// Laptop - 50000.0 руб., на складе: 10 шт.

product.sellProduct(3);
product.printInfo();
// Laptop - 50000.0 руб., на складе: 7 шт.

System.out.println(product.getTotalValue());  // 350000.0

product.addStock(5);
product.printInfo();
// Laptop - 50000.0 руб., на складе: 12 шт.
```

---

### Задача 3: Класс "Счётчик"

Создай класс `Counter` — простой счётчик, который может увеличиваться и уменьшаться.

**Требования:**

1. Приватное поле `count` (текущее значение счётчика)

2. Конструкторы:

   - Без параметров (начальное значение = 0)
   - С параметром `initialValue` (начальное значение)

3. Методы:
   - `increment()` — увеличить счётчик на 1
   - `decrement()` — уменьшить счётчик на 1
   - `reset()` — сбросить счётчик в 0
   - `getValue()` — получить текущее значение
   - `add(int value)` — добавить к счётчику указанное значение

**Пример использования:**

```java
Counter counter = new Counter();

counter.increment();
counter.increment();
counter.increment();
System.out.println(counter.getValue());  // 3

counter.decrement();
System.out.println(counter.getValue());  // 2

counter.add(10);
System.out.println(counter.getValue());  // 12

counter.reset();
System.out.println(counter.getValue());  // 0
```

---

### Задача 4: Класс "Температура"

Создай класс `Temperature` для работы с температурой в градусах Цельсия.

**Требования:**

1. Приватное поле `celsius`

2. Конструктор, принимающий температуру в Цельсиях

3. Геттер и сеттер для `celsius`

4. Методы:
   - `toFahrenheit()` — конвертировать в Фаренгейты (формула: `F = C × 1.8 + 32`)
   - `toKelvin()` — конвертировать в Кельвины (формула: `K = C + 273.15`)
   - `isFreezingPoint()` — вернуть `true`, если температура = 0°C
   - `isBoilingPoint()` — вернуть `true`, если температура = 100°C
   - `printInfo()` — вывести температуру во всех трёх шкалах

**Пример использования:**

```java
Temperature temp = new Temperature(25);

System.out.println(temp.toFahrenheit());  // 77.0
System.out.println(temp.toKelvin());      // 298.15

temp.printInfo();
// 25.0°C = 77.0°F = 298.15K

Temperature freezing = new Temperature(0);
System.out.println(freezing.isFreezingPoint());  // true
```

---

### Задача 5: Класс "Прямоугольник" (усложнённая)

Создай класс `Rectangle` для работы с прямоугольником.

**Требования:**

1. Приватные поля: `width` (ширина) и `height` (высота)

2. Конструкторы:

   - С двумя параметрами: `width`, `height`
   - С одним параметром: `side` (создаёт квадрат, используя `this()`)

3. Геттеры и сеттеры (в сеттерах проверка: значения должны быть > 0)

4. Методы:
   - `area()` — площадь прямоугольника
   - `perimeter()` — периметр прямоугольника
   - `isSquare()` — проверка, является ли прямоугольник квадратом
   - `scale(double factor)` — увеличить размеры в `factor` раз
   - `printInfo()` — вывести информацию о прямоугольнике

**Пример использования:**

```java
Rectangle rect1 = new Rectangle(10, 5);
Rectangle rect2 = new Rectangle(7);  // Квадрат 7x7

rect1.printInfo();
// Прямоугольник: 10.0 x 5.0, площадь: 50.0, периметр: 30.0

System.out.println(rect2.isSquare());  // true

rect1.scale(2);
rect1.printInfo();
// Прямоугольник: 20.0 x 10.0, площадь: 200.0, периметр: 60.0
```

---

## 5. Вопросы для самопроверки

### 1. Что такое конструктор и для чего он нужен?

<details>
<summary>Ответ</summary>

Конструктор — это специальный метод, который автоматически вызывается при создании объекта с помощью `new`. Он нужен для инициализации полей объекта начальными значениями.

</details>

---

### 2. Какие правила нужно соблюдать при написании конструктора?

<details>
<summary>Ответ</summary>

1. Имя конструктора должно совпадать с именем класса
2. У конструктора нет типа возвращаемого значения (даже `void` не пишется)
3. Конструктор вызывается автоматически при создании объекта через `new`

</details>

---

### 3. Что произойдёт, если не создать ни одного конструктора в классе?

<details>
<summary>Ответ</summary>

Java автоматически создаст конструктор по умолчанию (пустой, без параметров). Но как только ты создашь свой конструктор, конструктор по умолчанию исчезнет.

</details>

---

### 4. Можно ли создать несколько конструкторов в одном классе?

<details>
<summary>Ответ</summary>

Да, можно. Это называется перегрузка конструкторов. Конструкторы должны отличаться набором или типом параметров.

</details>

---

### 5. Что такое `this` и зачем оно нужно?

<details>
<summary>Ответ</summary>

`this` — это ссылка на текущий объект. Используется для:

1. Разрешения конфликта имён между полями и параметрами
2. Обращения к полям и методам текущего объекта
3. Вызова другого конструктора этого же класса

</details>

---

### 6. В чём разница между `name` и `this.name` в конструкторе?

<details>
<summary>Ответ</summary>

`this.name` — это поле класса (переменная объекта).  
`name` (без `this`) — это параметр метода или конструктора.  
Если имена совпадают, `this` помогает различить их.

</details>

---

### 7. Можно ли вызвать один конструктор из другого? Как?

<details>
<summary>Ответ</summary>

Да, с помощью `this(параметры)`. Это должна быть **первая строка** в конструкторе.

Пример:

```java
Rectangle(int side) {
    this(side, side);  // Вызывает Rectangle(int width, int height)
}
```

</details>

---

### 8. Что означает модификатор `private` и для чего он нужен?

<details>
<summary>Ответ</summary>

`private` означает, что поле или метод доступен только внутри класса. Снаружи к нему нельзя обратиться. Нужен для инкапсуляции — сокрытия внутренней реализации и защиты данных от некорректного изменения.

</details>

---

### 9. Что такое геттеры и сеттеры? Зачем они нужны?

<details>
<summary>Ответ</summary>

**Геттер** (getter) — метод для получения значения приватного поля. Обычно называется `getИмяПоля()`.

**Сеттер** (setter) — метод для изменения значения приватного поля. Обычно называется `setИмяПоля(значение)`.

Нужны для контролируемого доступа к приватным полям — можно добавить проверки, валидацию данных.

</details>

---

### 10. В чём разница между `public` и `private`?

<details>
<summary>Ответ</summary>

`public` — поле/метод доступен из любого места программы.  
`private` — поле/метод доступен только внутри класса, где он объявлен.

Пример:

```java
class Example {
    public int x;    // Доступен везде
    private int y;   // Доступен только в Example
}
```

</details>

---

## 📝 Резюме

✅ **Конструктор:**

- Специальный метод для инициализации объекта
- Имя совпадает с именем класса
- Нет типа возвращаемого значения
- Вызывается автоматически при создании объекта
- Можно создать несколько конструкторов (перегрузка)

✅ **this:**

- Ссылка на текущий объект
- Помогает различать поля и параметры
- Используется для вызова другого конструктора: `this(...)`

✅ **Модификаторы доступа:**

- `public` — доступен отовсюду
- `private` — доступен только внутри класса
- Инкапсуляция: скрываем детали, даём контролируемый доступ через геттеры/сеттеры

---

🎯 **Следующий шаг:** Практика! Реши все задачи, чтобы закрепить материал.
