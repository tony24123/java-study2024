package chap1_3.pratice;

public class BankAccount {
    String accountNumber;
    String owner;
    double balance;

    //입금기능
    void deposit(double money) {
        balance += money;
        System.out.printf("%f원이 입금되었습니다. 현재 잔고 : %f원\n", money, balance);
    }

    void withdraw(double money) {
        if (money > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= money;
        System.out.printf("%f원이 출금되었습니다. 현재 잔고 : %f원\n", money, balance);
    }

    // 잔고 출력
    void displayBalance() {
        System.out.println("현재 잔고: " + (int) balance);
    }


}
