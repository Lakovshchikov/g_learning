package org.yourcompany.g_learning.step3.examples;

/**
 * Базовый класс банковского счета
 */
public class BankAccount {
    String accountNumber;
    String ownerName;
    double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнение: +" + amount + " руб. Баланс: " + balance + " руб.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: -" + amount + " руб. Баланс: " + balance + " руб.");
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    public void displayBalance() {
        System.out.println("Счет " + accountNumber + " (" + ownerName + "): " + balance + " руб.");
    }
}
