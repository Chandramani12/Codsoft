package com.info.ATMMachine;
import java.util.*;
public class AtmMenu {
    public static int atmMenu(Scanner scanner, AtmMachine atmMachine) {
        System.out.println("Welcome to the ATM machine.");
        System.out.println("Please select an option:");
        System.out.println("1. Withdraw cash");
        System.out.println("2. Deposit cash");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();
        return choice;
    }
}