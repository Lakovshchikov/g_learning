# Задача 3: Односвязный список - добавление элементов

**Уровень:** 🟢 С готовым алгоритмом

---

## 📋 Описание задачи

Создай простейший односвязный список чисел. Каждый узел (`Node`) хранит число и ссылку на следующий узел.

---

## 🔗 Что такое односвязный список?

Это структура данных, где каждый элемент (узел) содержит:

- **Данные** (например, число)
- **Ссылку на следующий элемент**

**Визуально:**

```
[5] -> [10] -> [15] -> [20] -> null
```

Каждая стрелка `->` — это ссылка `next`, которая указывает на следующий узел.

---

## 📦 Класс Node (узел списка)

```java
class Node {
    int value;        // Значение узла
    Node next;        // Ссылка на следующий узел

    public Node(int value) {
        this.value = value;
        this.next = null;  // Изначально нет следующего узла
    }
}
```

---

## 📦 Класс LinkedList (сам список)

```java
class LinkedList {
    private Node head;  // Голова списка (первый элемент)

    public LinkedList() {
        this.head = null;  // Изначально список пуст
    }

    // Метод для добавления элемента в конец списка
    public void add(int value) {
        // Твоя реализация
    }

    // Вывод всех элементов списка
    public void printList() {
        // Твоя реализация
    }
}
```

---

## 🎯 Алгоритм добавления элемента в конец списка

### Шаг 1: Создай новый узел

Создай новый узел `newNode` с нужным значением:

```java
Node newNode = new Node(value);
```

### Шаг 2: Проверь, пуст ли список

**Если список пуст** (head == null):

- Новый узел становится головой списка
- Присвой `head = newNode`
- Выйди из метода (`return`)

### Шаг 3: Найди последний узел (если список не пуст)

- Создай переменную `current` и присвой ей `head`
- Проходи по списку в цикле `while (current.next != null)`
- На каждой итерации переходи к следующему узлу: `current = current.next`
- Когда дошли до последнего узла (у которого `next == null`), цикл закончится

### Шаг 4: Прикрепи новый узел к концу

- Присвой `current.next = newNode`

---

## 📊 Визуализация добавления

**Начальное состояние:** `head -> null` (список пуст)

**Добавляем 5:**

```
newNode = [5]
head == null → делаем head = newNode
Результат: head -> [5] -> null
```

**Добавляем 10:**

```
newNode = [10]
head != null → ищем последний
current = [5], current.next == null → нашли последний
current.next = newNode
Результат: head -> [5] -> [10] -> null
```

**Добавляем 15:**

```
newNode = [15]
head != null → ищем последний
current = [5], current.next != null → идём дальше
current = [10], current.next == null → нашли последний
current.next = newNode
Результат: head -> [5] -> [10] -> [15] -> null
```

---

## ✅ Ожидаемый результат

```
5 -> 10 -> 15 -> 20 -> null
```

---

## 💪 Задание

1. Реализуй классы `Node` и `LinkedList` с методом `add()`
2. Протестируй добавление нескольких элементов
3. Реализуй метод printList для вывода информации обо всех элементах списка
4. **Бонус 1:** Добавь метод `size()` — возвращает количество элементов в списке
5. **Бонус 2:** Добавь метод `contains(int value)` — проверяет, есть ли элемент в списке

---

## 💡 Подсказки

<details>
<summary>Подсказка 1: Метод size()</summary>

```java
public int size() {
    int count = 0;
    Node current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}
```

</details>

<details>
<summary>Подсказка 2: Метод contains()</summary>

```java
public boolean contains(int value) {
    Node current = head;
    while (current != null) {
        if (current.value == value) {
            return true;
        }
        current = current.next;
    }
    return false;
}
```

</details>

<details>
<summary>Подсказка 3: Структура метода add()</summary>

```java
public void add(int value) {
    Node newNode = new Node(value);

    if (head == null) {
        // Список пуст
        head = newNode;
        return;
    }

    // Ищем последний узел
    Node current = head;
    while (current.next != null) {
        current = current.next;
    }

    // Прикрепляем новый узел
    current.next = newNode;
}
```

</details>

---

## 🤔 Вопросы для размышления

1. Почему мы проверяем `current.next != null`, а не `current != null` при поиске последнего элемента?
2. Что произойдёт, если не проверить, пуст ли список?
3. Можно ли добавить элемент в начало списка? Как это сделать?
