package ch06.Exercise.Exercise19;

public class Account {
    private int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1_000_000;

    public void setBalance(int balance) {
        if (MIN_BALANCE > balance || MAX_BALANCE < balance) return;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
