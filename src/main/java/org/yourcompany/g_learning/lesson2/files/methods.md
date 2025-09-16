# 📑 Методы в Java на примере `String`

## 🔹 Что такое метод

- **Метод** — это функция, "действие", которое можно выполнить над объектом или внутри программы.
- У примитивов методов **нет**.
- У объектов методы есть, потому что они создаются на основе классов.

👉 Синтаксис вызова метода:

```java
имяОбъекта.имяМетода(аргументы)
```

Пример:

```java
String text = "Java";
int len = text.length(); // вызов метода length()
```

---

## 🔹 Методы у `String`

`String` — это объект, и у него есть много встроенных методов.

### 1. Длина строки

```java
String word = "Hello";
System.out.println(word.length()); // 5
```

### 2. Перевод регистра

```java
String word = "Java";
System.out.println(word.toUpperCase()); // "JAVA"
System.out.println(word.toLowerCase()); // "java"
```

### 3. Проверка содержания подстроки

```java
String word = "Programming";
System.out.println(word.contains("gram")); // true
System.out.println(word.contains("test")); // false
```

### 4. Сравнение строк

```java
String a = "Java";
String b = "java";

System.out.println(a.equals(b));        // false
System.out.println(a.equals("Java"));   // true
```

### 5. Проверка начала и конца строки

```java
String url = "https://example.com";

System.out.println(url.startsWith("https")); // true
System.out.println(url.endsWith(".com"));    // true
```

### 6. Замена символов/подстроки

```java
String text = "I like Java";
System.out.println(text.replace("Java", "Python")); // "I like Python"
```

---

## 🔹 Важные моменты

1. Методы у строк **не изменяют сам объект** (`String` неизменяемый).
   - Каждый вызов метода возвращает **новую строку**.
2. Методы можно **комбинировать**:
   ```java
   String name = " ivan ";
   String fixed = name.trim().toUpperCase();
   System.out.println(fixed); // "IVAN"
   ```
   Здесь:
   - `.trim()` убирает пробелы,
   - `.toUpperCase()` делает строку заглавной.

---

## 📌 Итог

- Метод = действие, которое можно вызвать у объекта.
- У строк (`String`) есть множество полезных методов: `length()`, `toUpperCase()`, `toLowerCase()`, `contains()`, `equals()`, `replace()`, `startsWith()`, `endsWith()` и другие.
- Важно помнить, что строки неизменяемые: любой метод создаёт **новый объект**.
