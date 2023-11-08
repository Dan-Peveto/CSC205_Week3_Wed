package CSC205_Week3_Wed;

public class Bank {
    private double balance = 0.00;
    public double getBalance() {
        return balance;
    }
    public void deposit(double depositValue) {
        balance += depositValue;
    }
    public void withdraw(double withdrawValue) {
        balance -= withdrawValue;
    }
}
