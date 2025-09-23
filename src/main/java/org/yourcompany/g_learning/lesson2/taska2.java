package org.yourcompany.g_learning.lesson2;

import java.util.Scanner;

public class taska2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // System.out.println("Vvedite drobnoe chislo:");
    // double score = sc.nextDouble();

    // if (score >= 90) {
    //     System.out.println("Otlichno");
    // } else if (70 <= score && score < 90) {
    //     System.out.println("Good");
    // } else if (50 <= score && score < 70) {
    //     System.out.println("Udovletvoritelno");
    // } else if (score < 50) {
    //     System.out.println("Neudovletvoritelno");
    // } else {
    //     System.out.println("Necorrectnoe znachenie");
    // }
    


    //  System.out.println("Vvedite word:");
    //  String word = sc.nextLine();
     
    //  System.out.println(word.length());
    //  String word1 = word.trim();
    //  if (word1.length()==0){
    //     System.out.println("Pustaya stroca");
    //  } else {System.out.println(word.toUpperCase());
    //  }

    // System.out.print(("java: " + word.contains("java")));

    // //  if (word.contains("java")) {
    // //     System.out.println("java:true");
    // //  } else {System.out.println("java:false");}

    //  if (word.startsWith("+7 || 8 ")){
    //     System.out.println("Maybe iphone");
    //  }
    //  if (word.endsWith(".com") || word.endsWith(".ru") ){
    //     System.out.println("Maybe domen");
    //  }

    System.out.println("Vvedite name:");
     String name = sc.nextLine();
    System.out.println("Vvedite age: ");
     int age = sc.nextInt();
    System.out.println("Vvedite 1-3");
     int choice = sc.nextInt();

     switch (choice) {
         case 1:
            System.out.println("Name: " + name + " (dlina: " + name.length() +")");
            String name1 = name.trim();
             if (name1.length()==0) {
                System.out.println("Name not zadano");
             }
             break;
         case 2:
            if (name.toUpperCase().contains("IVAN")) { // 2
                System.out.println("Hi, Ivan");
            } else { 
                System.out.println("Hi, " + name.toUpperCase()); // 1
            }
              break;
         case 3:
            if (age < 0 || age > 120) {
                System.out.println("Necorrectniy age");
            }
            if (age > 18 && age < 64) {
                System.out.println("Dostup razreshon: all");
            }
            if (age >= 65) {
                System.out.println("Dostup razreshon: lgota");
            }
            if (age < 18) {
                if (name.startsWith("Test")) {
                    System.out.println("Dostup ogranichen: test polsovatel");
                }
                else {
                    System.out.println("Dostup ogranichen: nesoverchennoletniy");
                }
            }
            break;
              default:
                System.out.println("Neizvestnaya comanda");
        }
    } 
}
