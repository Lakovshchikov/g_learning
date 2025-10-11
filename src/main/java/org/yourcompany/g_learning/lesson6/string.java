/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.yourcompany.g_learning.lesson6;

/**
 *
 * @author lakov
 */
public class string {
public static void main(String[] args) {


    String name = makeGreeting("asas");
    System.out.println(name);
    String l = longer("Galina","Ivan");
    System.out.println(l);
    String sk = concat("Galina","Ivan");
    System.out.println(sk);
    boolean st = startWithHello("Hello");
    System.out.println(st);
    int gl = countVowels("ivan");
    System.out.println(gl);
    String rs = removeSpaces("i love      you      ");
    System.out.println(rs);
    String tas = reverse("galina");
    System.out.println(tas);
    boolean tr = containsChar("cool", 'c');
    System.err.println(tr);
}
public static String makeGreeting(String name) {
    return "Hello, " + name + "!";
}
public static String longer(String a, String b) {
    if (a.length() > b.length()) {
        return a;
    }
    else if (a.length() < b.length()) {
        return b;
    }
    else { 
        return a;
    }
}
public static String concat(String a, String b) {
    return a + b;
}
public static boolean startWithHello(String a) {
    return a.startsWith("Hello");
}
public static int countVowels(String a) {
    int sum = 0;
    char b = a.charAt(2); // l

    for (int i = 0; i < a.length(); i++) {
     if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u' || a.charAt(i) == 'y'){
        sum++;
     }
    }
    return sum;
}
public static String removeSpaces(String a) {
    String b = "";
    for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) != ' ') {
           b = b + a.charAt(i);
        }
    }
    return b;
}
public static String reverse (String a) {
    String b = "";
    for (int i = a.length() - 1; i >= 0; i--) {
        b = b + a.charAt(i);
    }
    return b;
}
public static boolean containsChar(String a, char c) {
    String b = "";
    for (int i = 0; i < a.length(); i++) {
        b = b + a.charAt(i);
    }  return b.contains("c");
}
}
