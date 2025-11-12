package org.yourcompany.g_learning.step3.examples;

/**
 * Сберегательный счет с процентами
 */
public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Начислены проценты: +" + interest + " руб. Баланс: " + balance + " руб.");
    }

    @Override
    public void displayBalance() {
        super.displayBalance();
        System.out.println("Процентная ставка: " + interestRate + "%");
    }
}
