package org.yourcompany.g_learning.step2.Static_private;

/**
 * ПРОСТОЙ ПРИМЕР: Класс Student
 * Демонстрирует: инкапсуляцию, static, final, геттеры/сеттеры
 */

class Student {
    
    // ============ КОНСТАНТЫ (static final) ============
    // Общие для всех, неизменяемые
    private static final int MIN_AGE = 16;
    private static final int MAX_AGE = 100;
    private static final double HONOR_GPA = 3.5;  // Порог для отличника
    
    // ============ СТАТИЧЕСКОЕ ПОЛЕ ============
    // Общее для всех студентов, считает количество
    private static int studentCount = 0;
    
    // ============ ПРИВАТНЫЕ ПОЛЯ (инкапсуляция) ============
    private final int id;       // final - нельзя изменить после создания
    private String name;        // Имя
    private int age;            // Возраст
    private double gpa;         // Средний балл
    
    // ============ КОНСТРУКТОР ============
    public Student(String name, int age, double gpa) {
        studentCount++;              // Увеличиваем счётчик
        this.id = studentCount;      // Присваиваем уникальный ID
        setName(name);               // Используем сеттер с валидацией
        setAge(age);
        setGpa(gpa);
    }
    
    // ============ ГЕТТЕРЫ (читаем приватные поля) ============
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // ============ СЕТТЕРЫ (изменяем с проверкой) ============
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ошибка: Имя не может быть пустым!");
        }
    }
    
    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE) {
            this.age = age;
        } else {
            System.out.println("Ошибка: Возраст от " + MIN_AGE + " до " + MAX_AGE);
        }
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Ошибка: GPA от 0.0 до 4.0");
        }
    }
    
    // ============ ОБЫЧНЫЕ МЕТОДЫ ============
    // Проверяет, отличник ли студент
    public boolean isHonorStudent() {
        return gpa >= HONOR_GPA;
    }
    
    // Вывод информации
    public void printInfo() {
        System.out.println("ID: " + id + ", Имя: " + name + 
                         ", Возраст: " + age + ", GPA: " + gpa +
                         ", Отличник: " + (isHonorStudent() ? "Да" : "Нет"));
    }
    
    // ============ СТАТИЧЕСКИЙ МЕТОД ============
    // Можно вызвать без создания объекта: Student.getStudentCount()
    public static int getStudentCount() {
        return studentCount;
    }
}

// ============ ГЛАВНЫЙ КЛАСС (демонстрация) ============
public class StudentExample {
    public static void main(String[] args) {
        System.out.println("=== ПРИМЕР РАБОТЫ КЛАССА STUDENT ===\n");
        
        // 1. Создание студентов
        Student s1 = new Student("Алексей", 20, 3.8);
        Student s2 = new Student("Мария", 19, 3.2);
        Student s3 = new Student("Иван", 21, 3.9);
        
        // Статический метод - вызываем БЕЗ объекта
        System.out.println("Создано студентов: " + Student.getStudentCount());
        System.out.println();
        
        // 2. Вывод информации
        System.out.println("Информация о студентах:");
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        
        // 3. Использование геттеров
        System.out.println("\nЧитаем данные через геттеры:");
        System.out.println("Имя: " + s1.getName());
        System.out.println("Возраст: " + s1.getAge());
        System.out.println("ID: " + s1.getId());  // final - нельзя изменить!
        
        // 4. Изменение через сеттеры
        System.out.println("\nИзменяем GPA Марии:");
        System.out.println("Было: " + s2.getGpa());
        s2.setGpa(3.7);
        System.out.println("Стало: " + s2.getGpa());
        
        // 5. Валидация работает!
        System.out.println("\nПопытки установить некорректные данные:");
        s2.setAge(15);      // Ошибка - слишком молодой
        s2.setGpa(5.0);     // Ошибка - превышает максимум
        s2.setName("");     // Ошибка - пустое имя
        
        // 6. Проверка отличников
        System.out.println("\nОтличники:");
        if (s1.isHonorStudent()) {
            System.out.println("- " + s1.getName());
        }
        if (s2.isHonorStudent()) {
            System.out.println("- " + s2.getName());
        }
        if (s3.isHonorStudent()) {
            System.out.println("- " + s3.getName());
        }
        
        // 7. Защита данных (инкапсуляция)
        System.out.println("\nЗащита данных:");
        System.out.println("✓ Нельзя: s1.gpa = 10.0 (поле private)");
        System.out.println("✓ Нельзя: s1.id = 999 (поле final)");
        System.out.println("✓ Можно только через геттеры/сеттеры с проверкой!");
        
        System.out.println("\n=== ДЕМОНСТРАЦИЯ ЗАВЕРШЕНА ===");
    }
}
