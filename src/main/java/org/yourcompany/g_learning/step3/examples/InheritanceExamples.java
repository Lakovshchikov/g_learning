package org.yourcompany.g_learning.step3.examples;

/**
 * Примеры использования наследования из лекции
 * Демонстрирует три разные иерархии классов
 */
public class InheritanceExamples {

    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("ПРИМЕР 1: ТРАНСПОРТ");
        System.out.println("=".repeat(60));
        demonstrateVehicles();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("ПРИМЕР 2: СОТРУДНИКИ КОМПАНИИ");
        System.out.println("=".repeat(60));
        demonstrateEmployees();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("ПРИМЕР 3: БАНКОВСКИЕ СЧЕТА");
        System.out.println("=".repeat(60));
        demonstrateBankAccounts();
    }

    /**
     * Демонстрация работы с транспортом
     */
    static void demonstrateVehicles() {
        Car myCar = new Car("Toyota Camry", 2020, 180, 4, "Бензин");
        System.out.println("Автомобиль создан:");
        myCar.displayInfo();
        myCar.move();
        myCar.honk();

        System.out.println("\n---");
        Car sportsCar = new Car("Porsche 911", 2023, 320, 2, "Бензин");
        System.out.println("Спортивный автомобиль:");
        sportsCar.displayInfo();
    }

    /**
     * Демонстрация работы с сотрудниками
     */
    static void demonstrateEmployees() {
        Employee employee = new Employee("Анна Смирнова", 28, "EMP002", 80000);
        System.out.println("Сотрудник:");
        employee.introduce();
        employee.work();

        System.out.println("\n---");
        Manager manager = new Manager("Иван Иванов", 35, "EMP001", 150000, 10);
        System.out.println("Менеджер:");
        manager.introduce();
        manager.work();
        manager.conductMeeting();
    }

    /**
     * Демонстрация работы с банковскими счетами
     */
    static void demonstrateBankAccounts() {
        BankAccount account = new BankAccount("ACC-12345", "Петр Петров", 10000);
        account.displayBalance();
        account.deposit(5000);
        account.withdraw(3000);

        System.out.println("\n---");
        SavingsAccount savings = new SavingsAccount("SA-54321", "Мария Иванова", 50000, 5.5);
        savings.displayBalance();
        savings.deposit(10000);
        savings.addInterest();
        savings.displayBalance();
    }
}
