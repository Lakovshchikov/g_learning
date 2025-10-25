# Задача 9: Двусвязный список

**Уровень:** 🔵 Без готового алгоритма

---

## 📋 Описание задачи

Создай двусвязный список, где каждый узел имеет ссылки на **предыдущий** и **следующий** элементы.

---

## 📦 Класс DoublyNode

```java
class DoublyNode {
    int value;
    DoublyNode prev;  // Ссылка на предыдущий узел
    DoublyNode next;  // Ссылка на следующий узел

    public DoublyNode(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}
```

---

## ✅ Требования

Создай класс `DoublyLinkedList` с методами:

1. `addFirst(int value)` — добавить элемент в начало
2. `addLast(int value)` — добавить элемент в конец
3. `removeFirst()` — удалить первый элемент
4. `removeLast()` — удалить последний элемент
5. `printForward()` — вывести список от начала к концу
6. `printBackward()` — вывести список от конца к началу

---

## 💡 Пример использования

```java
DoublyLinkedList list = new DoublyLinkedList();

list.addLast(10);
list.addLast(20);
list.addFirst(5);
list.addLast(30);

list.printForward();   // 5 <-> 10 <-> 20 <-> 30
list.printBackward();  // 30 <-> 20 <-> 10 <-> 5

list.removeFirst();
list.removeLast();

list.printForward();   // 10 <-> 20
```

---

## 💡 Подсказки

<details>
<summary>Подсказка 1: Поля класса</summary>

- Храни ссылки на `head` (первый) и `tail` (последний) элементы
- При добавлении/удалении обновляй `prev` и `next` у соседних узлов

```java
class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
}
```

</details>

<details>
<summary>Подсказка 2: Добавление в начало</summary>

```java
public void addFirst(int value) {
    DoublyNode newNode = new DoublyNode(value);

    if (head == null) {
        // Список пуст
        head = tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
}
```

</details>

<details>
<summary>Подсказка 3: Добавление в конец</summary>

```java
public void addLast(int value) {
    DoublyNode newNode = new DoublyNode(value);

    if (tail == null) {
        // Список пуст
        head = tail = newNode;
    } else {
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }
}
```

</details>

<details>
<summary>Подсказка 4: Вывод назад</summary>

Для вывода от конца к началу начни с `tail` и иди по ссылкам `prev`:

```java
public void printBackward() {
    DoublyNode current = tail;
    while (current != null) {
        System.out.print(current.value + " <-> ");
        current = current.prev;
    }
    System.out.println("null");
}
```

</details>

---

## 🤔 Вопросы для размышления

1. В чём преимущества двусвязного списка перед односвязным?
2. Сколько дополнительной памяти требует двусвязный список?
3. Как удалить элемент из середины двусвязного списка?
