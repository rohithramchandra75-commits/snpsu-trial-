package assignments;

public class bankaccounts {
    String name;
    double balance;
    public bankaccounts(String name, double balance) {
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

