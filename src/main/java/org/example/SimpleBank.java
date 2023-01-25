package org.example;
import java.util.*;
class SimpleBank {
    private final String name;
    private final int accno;
    private double bal;
    static Scanner sc = new Scanner(System.in);

    SimpleBank() {
        System.out.println("Enter the customer name:");

        this.name = sc.nextLine();
        System.out.println("Enter customer account number:");
        this.accno = sc.nextInt();
        System.out.println("Enter the current balance");
        this.bal = sc.nextDouble();

    }

    public void deposite() {
        double d;
        System.out.println("Enter the deposite amount");
        d = sc.nextDouble();
        this.bal += d;
        System.out.println("Your amount is deposited successfully");

    }

    public void withdraw() {
        double w;
        System.out.println("Enter the withdraw amount:");
        w = sc.nextDouble();
        if (w <= this.bal) {
            this.bal = this.bal - w;
            System.out.println("your amount is withdraw successfully");
        } else {
            System.out.println("Sorry you have insufficient amount in your account");
        }
    }

    public double balance() {
        System.out.println("Name:" + this.name);
        System.out.println("Account number" + this.accno);
        return this.bal;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to TMB bank");
        System.out.println("What we want to do");
        SimpleBank s = new SimpleBank();

        int n;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1.deposite\n2.withdraw\n3.balance\n4.exit");
            n = sc.nextInt();
            switch (n) {
                case 1 -> s.deposite();
                case 2 -> s.withdraw();
                case 3 -> {
                    double te = s.balance();
                    System.out.println("Your account balance is:" + te);
                }
                default -> System.out.println("Thanks for the coming");

            }

        } while (n != 4);

        sc.close();
    }
}