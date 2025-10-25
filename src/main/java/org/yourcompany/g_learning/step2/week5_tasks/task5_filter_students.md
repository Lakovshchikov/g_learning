# Задача 5: Фильтрация массива студентов

**Уровень:** 🔵 Без готового алгоритма

---

## 📋 Описание задачи

У тебя есть массив студентов. Создай метод `filterByGpa(Student[] students, double minGpa)`, который возвращает **новый массив** только тех студентов, у которых средний балл >= `minGpa`.

---

## 📦 Класс Student

Используй класс из задачи 1:

```java
class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void printInfo() {
        System.out.println(name + " (средний балл: " + gpa + ")");
    }
}
```

---

## ✅ Требования

- Метод должен вернуть новый массив (не изменять старый)
- Если подходящих студентов нет — вернуть пустой массив
- Порядок студентов в новом массиве должен сохраниться

---

## 💡 Пример использования

```java
Student[] students = {
    new Student("Иван", 3.5),
    new Student("Мария", 4.8),
    new Student("Пётр", 3.2),
    new Student("Анна", 4.9),
    new Student("Сергей", 4.1)
};

Student[] filtered = Student.filterByGpa(students, 4.0);

System.out.println("Студенты с баллом >= 4.0:");
for (Student s : filtered) {
    s.printInfo();
}
```

**Ожидаемый результат:**

```
Студенты с баллом >= 4.0:
Мария (средний балл: 4.8)
Анна (средний балл: 4.9)
Сергей (средний балл: 4.1)
```

---

## 💡 Подсказки

<details>
<summary>Подсказка 1: Общий план решения</summary>

1. Сначала посчитай, сколько студентов подходит (пройди по массиву, считай)
2. Создай новый массив нужного размера
3. Ещё раз пройди по исходному массиву, добавляя подходящих студентов в новый

</details>

<details>
<summary>Подсказка 2: Как посчитать количество подходящих</summary>

```java
int count = 0;
for (int i = 0; i < students.length; i++) {
    if (students[i].getGpa() >= minGpa) {
        count++;
    }
}
```

</details>

<details>
<summary>Подсказка 3: Как заполнить новый массив</summary>

```java
Student[] result = new Student[count];
int index = 0;
for (int i = 0; i < students.length; i++) {
    if (students[i].getGpa() >= minGpa) {
        result[index] = students[i];
        index++;
    }
}
```

</details>

---

## 🤔 Вопросы для размышления

1. Можно ли решить задачу за один проход по массиву?
2. Что вернёт метод, если все студенты подходят?
3. Что вернёт метод, если ни один студент не подходит?
