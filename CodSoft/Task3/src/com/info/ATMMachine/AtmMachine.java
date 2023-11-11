package com.info.ATMMachine;
import java.util.*;
public class AtmMachine {
    private BankAccount account;

    public AtmMachine(BankAccount account) {
        this.account = account;
    }

    public void withdrawCash() {
        System.out.println("Enter amount to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();

        try {
            validateWithdrawAmount(amount);

            account.withdraw(amount);

            System.out.println("Withdrawal successful. Your new balance is: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds.");
        }
    }

    public void depositCash() {
        System.out.println("Enter amount to deposit: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();

        try {
            validateDepositAmount(amount);

            account.deposit(amount);

            System.out.println("Deposit successful. Your new balance is: " + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Invalid amount.");
        }
    }

    public double checkBalance() {
        return account.getBalance();
    }

    public void validateWithdrawAmount(double amount) throws InsufficientFundsException {
        if (amount > account.getBalance()) {
            throw new InsufficientFundsException("Insufficient funds.");
        }
    }

    public void validateDepositAmount(double amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Deposit amount cannot be negative.");
        }
    }
}