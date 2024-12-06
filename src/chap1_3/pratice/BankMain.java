package chap1_3.pratice;

public class BankMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(5000);
        myAccount.deposit(7000);
        myAccount.withdraw(8000);
        myAccount.withdraw(89000);
        myAccount.displayBalance();

    }
}
