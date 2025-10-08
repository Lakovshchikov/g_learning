package org.yourcompany.g_learning.step2.l1l_Classes_objects;


class Dog {
    String name;
    int age;

    void bark() {
        System.out.println(name + " гавкает!");
    }

    void printInfo() {
        System.out.println("Имя: " + name + ", возраст: " + age + " лет");
    }
}

public class ExampleClasses {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Бобик";
        dog1.age = 3;

        Dog dog2 = new Dog();
        dog2.name = "Шарик";
        dog2.age = 5;

        dog1.printInfo();
        dog2.printInfo();
        dog1.bark();
        dog2.bark();
    }
}
