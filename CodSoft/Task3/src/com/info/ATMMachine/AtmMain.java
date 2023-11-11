package com.info.ATMMachine;
import java.util.*;
public class AtmMain {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine(new BankAccount(1000));

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int choice = AtmMenu.atmMenu(scanner, atmMachine);

                switch (choice) {
                    case 1:
                        atmMachine.withdrawCash();
                        break;
                    case 2:
                        atmMachine.depositCash();
                        break;
                    case 3:
                        System.out.println("Your balance is: " + atmMachine.checkBalance());
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}