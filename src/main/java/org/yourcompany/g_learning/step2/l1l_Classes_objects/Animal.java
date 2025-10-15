/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.step2.l1l_Classes_objects;

/**
 *
 * @author lakov
 */
class PetShop {
    int catCount = 0;
    int dogCount = 0;
    int parrotCount = 4;

    boolean ascCat(){
        return catCount > 0;
    }
    boolean ascDog(){
        return dogCount > 0;
    }
    boolean ascParrot(){
        return parrotCount >0;
    }
    Cat1 buyCat(){
        Cat1 cat1 = new Cat1();
        catCount = catCount - 1;
        return cat1;

    }
    Dog1 buyDog(){
        Dog1 dog1 = new Dog1();
        dogCount = dogCount - 1;
        return dog1;
    }
    Parrot buyParrot(){
        Parrot parrot1 = new Parrot();
        parrotCount = parrotCount - 1;
        return parrot1;
    }
}

class Cat1 {
    int age;
    String name;
    void voice(){
        System.out.println("May");
    }
}
class Dog1 {
    int age;
    String name;
    void voice(){
        System.out.println("Gav");
    }
}
class Parrot {
    int age;
    String name;
    void voice(){
        System.out.println("Chirik");
    }
}

public class Animal {
    Dog1 dog;
public static void main(String[] args) {

    PetShop i = new PetShop();

    i.ascCat();
    i.ascDog();
    i.ascParrot();

   Parrot parrot1 = i.buyParrot();
   parrot1.name = "Kecha";
   parrot1.age = 2;
    parrot1.voice();
    System.out.println("Parrot " + parrot1.name + " Age " + parrot1.age);
}
} 
