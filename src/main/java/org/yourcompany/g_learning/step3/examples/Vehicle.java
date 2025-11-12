package org.yourcompany.g_learning.step3.examples;

/**
 * Базовый класс для всех транспортных средств
 */
public class Vehicle {
    String brand;
    int year;
    double maxSpeed;

    public Vehicle(String brand, int year, double maxSpeed) {
        this.brand = brand;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand + ", Год: " + year + ", Скорость: " + maxSpeed + " км/ч");
    }

    public void move() {
        System.out.println(brand + " движется");
    }
}
