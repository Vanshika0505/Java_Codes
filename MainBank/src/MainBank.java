import java.util.*;
class Bank {
    private static int nextAccountNumber = 1001;
    private String name;
    private String address;
    private int accountNumber;
    private double balance;
    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = nextAccountNumber++;
        this.balance = balance;
    }
 
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
 
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }
 
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }
 
    public void changeAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address changed successfully.");
    }
}
 
public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int numDepositors = sc.nextInt();
        sc.nextLine(); // Consume newline
 
        Bank[] depositors = new Bank[numDepositors];
        for (int i = 0; i < numDepositors; i++) {
            System.out.println("\nEnter details for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume newline
            depositors[i] = new Bank(name, address, balance);
        }
 
        System.out.println("\nEnter the depositor number you want to display: ");
        int depositorIndex = sc.nextInt();
        depositors[depositorIndex - 1].displayInfo();
        System.out.println("\nEnter the depositor number you want to deposit money into: ");
        depositorIndex = sc.nextInt();
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = sc.nextDouble();
        depositors[depositorIndex - 1].deposit(depositAmount);
        depositors[depositorIndex - 1].displayInfo();
 
        System.out.println("\nEnter the depositor number you want to withdraw money from: ");
        depositorIndex = sc.nextInt();
        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        depositors[depositorIndex - 1].withdraw(withdrawAmount);
        depositors[depositorIndex - 1].displayInfo();
 
        System.out.println("\nEnter the depositor number you want to change address for: ");
        depositorIndex = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter the new address: ");
        String newAddress = sc.nextLine();
        depositors[depositorIndex - 1].changeAddress(newAddress);
        depositors[depositorIndex - 1].displayInfo();
    }
}
 
