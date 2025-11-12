package org.yourcompany.g_learning.step3.examples;

/**
 * Класс сотрудника, наследует Person
 */
public class Employee extends Person {
    String employeeId;
    double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " работает (зарплата: " + salary + " руб.)");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("ID: " + employeeId);
    }
}
