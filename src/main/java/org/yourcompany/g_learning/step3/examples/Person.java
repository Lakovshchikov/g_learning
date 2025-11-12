package org.yourcompany.g_learning.step3.examples;

/**
 * Базовый класс человека
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
}
