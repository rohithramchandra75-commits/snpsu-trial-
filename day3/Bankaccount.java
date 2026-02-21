package day3;

import java.util.Scanner;

public class Bankaccount {
    String name;
    double balance;

    public Bankaccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
        System.out.println("deposited " + this.balance);
        System.out.println("updated balance");
    }

    public void withdraw(double balance) {
        if (this.balance >= balance) {
            this.balance -= balance;
            System.out.println("withdrawn " + this.balance);
        }
        else{
            System.out.println("insufficient balance");
        }
    }

    public void displaybalance() {
        System.out.println("name:" + this.name);
        System.out.println("balance:" + this.balance);
    }
}
    class main{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter initial amount");
            Bankaccount b=new Bankaccount("Rai",sc.nextInt());
            System.out.println("enter deposit amount");
            b.deposit(sc.nextDouble());
            System.out.println("enter withdraw amount");
            b.withdraw(sc.nextDouble());
            b.displaybalance();
        }
    }

