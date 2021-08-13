public class BankAccount {
    private double balance;
    private String name;                   // would use an Account # in real life to keep each account individual
    public BankAccount(String name) {       // setting up BankAccount Constructor
        this.name = name;                   // passing value received from 'name' (Formal Parameter) to the instance variable
        balance = 0.0;                         // not a necessary step in Java because 'instance variables' are initialized to 0 when created
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " has $" + balance);
    }
    public void withdraw(double amount) {
        // verify that amount is greater than 0 and withdraw amount is less than current balance
        if (amount <= balance) {
            balance -= amount;
            System.out.println(name + " has $" + balance);
        }
        else {
            System.out.println("Withdraw by " + name + " is NOT approved. Please check your balance.");
        }
    }

    public void transfer(double amount, BankAccount acc) {

        // check to see if transfer of money is allowed - if balance is less than amount then transfer will fail
        if (this.balance < amount) {
            System.out.println("the transfer is NOT authorized. Please check your balance.");
        } else {
            this.balance -= amount;
            acc.balance += amount;              // a reference variable that points to a BankAccount Object
            System.out.println("The Account of " + this.name + " is $"
                    + this.balance + " after the money transfer.");
            System.out.println("Account of " + acc.name + " becomes $" + acc.balance);
        }
    }

}
