/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.step2.l1l_Classes_objects;

/**
 *
 * @author lakov
 */
class Cat {
    String name;
    int age;
    void meow(){
    System.out.println("May " + name);
    }
}
class Car {
    String brand;
    String color;
    int year;
    void printInfo(){
        System.out.println("Marka: " + brand + ", Color: " + color + ", Year " + year);
    }
    void drive() {
        System.out.println("Auto " + brand + " go");
    }
}
class Book {
    String title;
    String author;
    int pages;
    void printInfo(){
        System.out.println("\"" + title + "\" - " + author + ", " + pages + " str");
    }
}
class Caar {
    String model;
}
class Flower {
    String type;
    String title;
    int height;

    void grow(int gr){
        height += gr;
    }
}

public class Class {
    public static void main (String[] args) {

        // Cat cat1 = new Cat();
        // cat1.name = "Murzik";
        // cat1.age = 2;

        // Cat cat2 = new Cat();
        // cat2.name = "Barsik";
        // cat2.age = 1;

        // System.out.println("Name " + cat1.name + ", age: " + cat1.age);
        // System.out.println("Name " + cat2.name + ", age: " + cat2.age);

        // cat1.meow();
        // cat2.meow();

        // Car car1 = new Car();
        // car1.brand = "BMW";
        // car1.color = "Blac";
        // car1.year = 2020;

        // Car car2 = new Car();
        // car2.brand = "Audi";
        // car2.color = "Weit";
        // car2.year = 2019;

        // Car car3 = new Car();
        // car3.brand = "Mercedes";
        // car3.color = "Serebro";
        // car3.year = 2011;

        // car1.printInfo();
        // car2.printInfo();
        // car3.printInfo();

        // car1.drive();
        // car2.drive();
        // car3.drive();

        // Book book1 = new Book();
        // book1.title = "Voina and mir";
        // book1.author = "Lev Tolstoi";
        // book1.pages = 1234;

        // Book book2 = new Book();
        // book2.title = "Evgeni Onegin";
        // book2.author = "Alexandr Puchkin";
        // book2.pages = 325;

        // Book book3 = new Book();
        // book3.title = "Istochnik";
        // book3.author = "Ain Rand";
        // book3.pages = 1004;

        // book1.printInfo();
        // book2.printInfo();
        // book3.printInfo();

        // Caar caar1 = new Caar();
        // caar1.model = "BMW";

        // Caar caar2 = caar1;
        // caar2.model = "Audi";

        // caar2 = new Caar();
        // caar2.model = "Mercedes";

        // System.out.println("caar1.model: " + caar1.model);
        // System.out.println("caar2.model: " + caar2.model);

        // int a = 5;
        // int b = a;
        // b = 10;
        // System.out.println(a);

        Flower flower1 = new Flower();
        flower1.type = "Home";
        flower1.title = "Spatifillum";
        flower1.height = 10;

        Flower flower2 = new Flower();
        flower2.type = "Strit";
        flower2.title = "Gartenziya";
        flower2.height = 13;

        flower1.grow(5);
        flower2.grow(10);

    }


}