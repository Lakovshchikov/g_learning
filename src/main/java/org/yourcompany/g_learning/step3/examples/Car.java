package org.yourcompany.g_learning.step3.examples;

/**
 * Класс автомобиля, наследует Vehicle
 */
public class Car extends Vehicle {
    int numberOfDoors;
    String fuelType;

    public Car(String brand, int year, double maxSpeed, int numberOfDoors, String fuelType) {
        super(brand, year, maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public void honk() {
        System.out.println("Биип-биип!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Двери: " + numberOfDoors + ", Топливо: " + fuelType);
    }
}
