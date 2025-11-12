package org.yourcompany.g_learning.step3.examples;

/**
 * Класс менеджера, наследует Employee
 */
public class Manager extends Employee {
    int teamSize;

    public Manager(String name, int age, String employeeId, double salary, int teamSize) {
        super(name, age, employeeId, salary);
        this.teamSize = teamSize;
    }

    public void conductMeeting() {
        System.out.println(name + " проводит встречу (команда: " + teamSize + " чел.)");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Размер команды: " + teamSize);
    }
}
