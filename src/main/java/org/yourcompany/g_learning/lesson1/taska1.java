

package org.yourcompany.g_learning.lesson1;
import java.util.Scanner;
public class taska1 {
    // main — точка входа. Программа всегда начинает выполнение отсюда.
    public static void main(String[] args) {
    
        // Scanner sc = new Scanner (System.in);
        // System.out.print("What is your name ");
        // String name = sc.nextLine();
        // System.out.println("Hi, " + name + "!");

    // Scanner sc = new Scanner (System.in);
    // System.out.println("Vvedite one chislo");
    // int one = sc.nextInt();
    // System.out.println("Vvedite too chislo");
    // int too = sc.nextInt();
    
    // if (one > too) {
    //     System.out.println(too);
    // }
    //     else {System.out.println(one);
    //     }
    Scanner sc = new Scanner (System.in);
    System.out.println("Vvedite login");
    String log1 = "admin"; 
    String log = sc.nextLine();
    System.out.println("Vvedite password");
    int pas1 = 1234;
    int pas = sc.nextInt();
    if (log1.equals(log) && pas1 == pas) {
        System.out.println("Welcome");
    }else {System.out.println("Good bay");}
        }
} 