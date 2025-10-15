package org.yourcompany.g_learning.step2.Ctros_mod_this;

/**
 * Класс Student - пример работы с:
 * - конструкторами (несколько вариантов)
 * - ключевым словом this
 * - модификаторами доступа (private, public)
 * - геттерами и сеттерами
 */
public class StudentExample {

    // ===== ПРИВАТНЫЕ ПОЛЯ =====
    // Эти поля доступны только внутри класса
    // Снаружи к ним нельзя обратиться напрямую
    private String name;        // Имя студента
    private int age;            // Возраст
    private String email;       // Email
    private double averageGrade; // Средний балл (от 0 до 5)

    // ===== КОНСТРУКТОРЫ =====

    /**
     * Конструктор 1: Полный конструктор со всеми параметрами
     * Используем this для различия между полями класса и параметрами
     */
    public StudentExample(String name, int age, String email, double averageGrade) {
        // this.name - это поле класса
        // name (справа) - это параметр конструктора
        this.name = name;
        this.age = age;
        this.email = email;

        // Используем сеттер вместо прямого присвоения,
        // чтобы применить проверку корректности данных
        this.setAverageGrade(averageGrade);
    }

    /**
     * Конструктор 2: Без среднего балла (по умолчанию 0)
     * Вызываем другой конструктор через this(...)
     */
    public StudentExample(String name, int age, String email) {
        // Вызываем конструктор с 4 параметрами
        // this(...) должен быть первой строкой!
        this(name, age, email, 0.0);
    }

    /**
     * Конструктор 3: Только имя и возраст
     * Email по умолчанию пустой, балл 0
     */
    public StudentExample(String name, int age) {
        this(name, age, "", 0.0);
    }

    // ===== ГЕТТЕРЫ (GETTERS) =====
    // Методы для ПОЛУЧЕНИЯ значений приватных полей

    /**
     * Получить имя студента
     * @return имя
     */
    public String getName() {
        return this.name;
    }

    /**
     * Получить возраст студента
     * @return возраст
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Получить email студента
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Получить средний балл
     * @return средний балл
     */
    public double getAverageGrade() {
        return this.averageGrade;
    }

    // ===== СЕТТЕРЫ (SETTERS) =====
    // Методы для ИЗМЕНЕНИЯ значений приватных полей
    // В сеттерах добавляем проверки данных

    /**
     * Установить имя студента
     * @param name новое имя
     */
    public void setName(String name) {
        // Проверяем, что имя не пустое
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("❌ Ошибка: имя не может быть пустым!");
        }
    }

    /**
     * Установить возраст студента
     * @param age новый возраст
     */
    public void setAge(int age) {
        // Проверяем корректность возраста
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("❌ Ошибка: возраст должен быть от 16 до 100!");
        }
    }

    /**
     * Установить email студента
     * @param email новый email
     */
    public void setEmail(String email) {
        // Простая проверка наличия @
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("❌ Ошибка: некорректный email (должен содержать @)!");
        }
    }

    /**
     * Установить средний балл
     * @param averageGrade новый средний балл
     */
    public void setAverageGrade(double averageGrade) {
        // Проверяем, что балл в допустимом диапазоне
        if (averageGrade >= 0 && averageGrade <= 5) {
            this.averageGrade = averageGrade;
        } else {
            System.out.println("❌ Ошибка: балл должен быть от 0 до 5!");
            this.averageGrade = 0;
        }
    }

    // ===== ПУБЛИЧНЫЕ МЕТОДЫ =====

    /**
     * Вывести информацию о студенте
     */
    public void printInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📚 Информация о студенте:");
        System.out.println("   Имя: " + this.name);
        System.out.println("   Возраст: " + this.age + " лет");
        System.out.println("   Email: " + (this.email.isEmpty() ? "не указан" : this.email));
        System.out.println("   Средний балл: " + this.averageGrade);
        System.out.println("   Статус: " + this.getStatus());
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * Получить статус студента на основе среднего балла
     * @return статус (отличник, хорошист и т.д.)
     */
    public String getStatus() {
        if (this.averageGrade >= 4.5) {
            return "⭐ Отличник";
        } else if (this.averageGrade >= 3.5) {
            return "✅ Хорошист";
        } else if (this.averageGrade >= 2.5) {
            return "📝 Троечник";
        } else {
            return "⚠️ Неуспевающий";
        }
    }

    /**
     * Проверить, может ли студент получить стипендию
     * @return true если средний балл >= 4.0
     */
    public boolean canGetScholarship() {
        return this.averageGrade >= 4.0;
    }

    // ===== ПРИВАТНЫЕ МЕТОДЫ =====
    // Эти методы доступны только внутри класса

    /**
     * Приватный метод для форматирования имени
     * Используется только внутри класса
     */
    private String formatName() {
        // Делаем первую букву заглавной
        if (this.name != null && !this.name.isEmpty()) {
            return this.name.substring(0, 1).toUpperCase() +
                   this.name.substring(1).toLowerCase();
        }
        return this.name;
    }

    // ===== ГЛАВНЫЙ МЕТОД (ДЕМОНСТРАЦИЯ) =====

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║  ДЕМОНСТРАЦИЯ РАБОТЫ С КЛАССОМ STUDENT    ║");
        System.out.println("╚════════════════════════════════════════════╝\n");

        // ===== 1. СОЗДАНИЕ ОБЪЕКТОВ РАЗНЫМИ КОНСТРУКТОРАМИ =====
        System.out.println("📌 1. Создание объектов через разные конструкторы:\n");

        // Полный конструктор
        StudentExample student1 = new StudentExample("Иван", 20, "ivan@mail.com", 4.5);
        System.out.println("✅ Создан student1 (полный конструктор)");

        // Конструктор без среднего балла
        StudentExample student2 = new StudentExample("Мария", 19, "maria@mail.com");
        System.out.println("✅ Создан student2 (без балла)");

        // Конструктор только с именем и возрастом
        StudentExample student3 = new StudentExample("Пётр", 21);
        System.out.println("✅ Создан student3 (только имя и возраст)\n");

        // ===== 2. ИСПОЛЬЗОВАНИЕ ГЕТТЕРОВ =====
        System.out.println("📌 2. Получение данных через геттеры:\n");

        System.out.println("Имя student1: " + student1.getName());
        System.out.println("Возраст student1: " + student1.getAge());
        System.out.println("Email student1: " + student1.getEmail());
        System.out.println("Средний балл student1: " + student1.getAverageGrade());
        System.out.println();

        // ===== 3. ИСПОЛЬЗОВАНИЕ СЕТТЕРОВ =====
        System.out.println("📌 3. Изменение данных через сеттеры:\n");

        // Корректное изменение
        student2.setAverageGrade(3.8);
        System.out.println("✅ Установлен балл 3.8 для student2\n");

        // Попытка установить некорректные данные
        System.out.println("Попытка установить некорректные данные:");
        student3.setAverageGrade(6.0);  // Больше максимума
        student3.setAge(15);             // Меньше минимума
        student3.setEmail("invalid");    // Нет символа @
        System.out.println();

        // ===== 4. ВЫВОД ИНФОРМАЦИИ =====
        System.out.println("📌 4. Вывод полной информации о студентах:\n");

        student1.printInfo();
        System.out.println();
        student2.printInfo();
        System.out.println();
        student3.printInfo();
        System.out.println();

        // ===== 5. ИСПОЛЬЗОВАНИЕ МЕТОДОВ =====
        System.out.println("📌 5. Проверка права на стипендию:\n");

        System.out.println(student1.getName() + " - стипендия: " +
                         (student1.canGetScholarship() ? "✅ Да" : "❌ Нет"));
        System.out.println(student2.getName() + " - стипендия: " +
                         (student2.canGetScholarship() ? "✅ Да" : "❌ Нет"));
        System.out.println(student3.getName() + " - стипендия: " +
                         (student3.canGetScholarship() ? "✅ Да" : "❌ Нет"));
        System.out.println();

        // ===== 6. ДЕМОНСТРАЦИЯ ЗАЩИТЫ ДАННЫХ =====
        System.out.println("📌 6. Защита данных (нельзя изменить напрямую):\n");

        // Это вызовет ошибку компиляции, если раскомментировать:
        // student1.name = "Хакер";           // ❌ ОШИБКА! name - private
        // student1.age = -100;               // ❌ ОШИБКА! age - private
        // student1.averageGrade = 999;       // ❌ ОШИБКА! averageGrade - private

        System.out.println("⚠️  Приватные поля нельзя изменить напрямую!");
        System.out.println("✅ Только через сеттеры с проверками!\n");

        // ===== 7. МАССИВ СТУДЕНТОВ =====
        System.out.println("📌 7. Работа с массивом студентов:\n");

        StudentExample[] students = {
            new StudentExample("Анна", 20, "anna@mail.com", 4.8),
            new StudentExample("Дмитрий", 22, "dmitry@mail.com", 3.2),
            new StudentExample("Елена", 19, "elena@mail.com", 4.1)
        };

        System.out.println("Список всех студентов:");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getName() +
                             " - " + students[i].getAverageGrade() +
                             " - " + students[i].getStatus());
        }
        System.out.println();

        // Поиск лучшего студента
        StudentExample bestStudent = students[0];
        for (StudentExample student : students) {
            if (student.getAverageGrade() > bestStudent.getAverageGrade()) {
                bestStudent = student;
            }
        }

        System.out.println("🏆 Лучший студент: " + bestStudent.getName() +
                         " (балл: " + bestStudent.getAverageGrade() + ")");

        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║         ДЕМОНСТРАЦИЯ ЗАВЕРШЕНА            ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }
}
