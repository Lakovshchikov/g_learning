package org.yourcompany.g_learning.lesson6;

public class SimpleMethodsDemo {
    public static void main(String[] args) {
        sayHello();                          // метод без параметров
        greet("Ivan");                       // метод с параметром
        int sum = addTwoNumbers(2, 3);       // метод с возвращаемым значением (int)
        System.out.println("Summ: " + sum);

        boolean check = isEven(4);           // метод с возвращаемым значением (boolean)
        System.out.println("Is even number - 4? " + check);

        String text = makeGreeting("Ann");  // метод с возвращаемым значением (String)
        System.out.println(text);
    }

    // метод без параметров и возвращаемого значения
    public static void sayHello() {
        System.out.println("Hi!");
    }

    // метод с параметром и без возвращаемого значения
    public static void greet(String name) {
        System.out.println("Hi, " + name + "!");
    }

    // метод с параметрами и возвращаемым значением (int)
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // метод с параметром и возвращаемым значением (boolean)
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // метод с параметром и возвращаемым значением (String)
    public static String makeGreeting(String name) {
        return "Hello, " + name + "!";
    }
}