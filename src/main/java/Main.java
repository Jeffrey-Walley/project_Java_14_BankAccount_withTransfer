// project 14 Bank Account with transfer        --Begin Coding Fast     site:   https://www.youtube.com/watch?v=71pKrsz9VwU&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=14
/*
  1- create BankAccount Object
  2- enable BankAccount to deposit and withdraw money
  3- ability to transfer money to other accounts
 */

public class Main {
    public static void main(String[] args) {
        BankAccount trelvyn = new BankAccount("Trelvyn");
        trelvyn.deposit(575.82);
        BankAccount isis = new BankAccount("Isis");
        isis.deposit(238.57);

        trelvyn.transfer(100.0, isis);

        isis.withdraw(58.00);
        isis.withdraw(575.00);

        System.out.println(trelvyn.getBalance());
        System.out.println(isis.getBalance());
    }
}
