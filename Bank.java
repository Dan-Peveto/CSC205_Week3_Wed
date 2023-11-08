package CSC205_Week3_Wed;

public class Bank {
    private double balance;
    private static double BankBalance;
    AccountTypeEnum AccountType;
    String AuthorizedUser;
    final String RoutingNumber = "SDFLKJWEOIC*E*$&$HD*";

    public Bank() {
        AccountType = AccountTypeEnum.CHECKING;
        AuthorizedUser = "newUser";
        balance = 100.00;
    }

    public Bank(String AuthorizedUser) {
        this.AuthorizedUser = AuthorizedUser;
        AccountType = AccountTypeEnum.CHECKING;
        BankBalance += balance;
    }

    public Bank(String AuthorizedUser, double balance) {
        this.AuthorizedUser = AuthorizedUser;
        this.balance = balance; 
        BankBalance += balance;
    }

    public double getBalance() {
        return balance;
    }

    public static double getBankBalance() {
        return BankBalance;
    }

    public double deposit(double depositValue) {
        BankBalance += depositValue;
        return balance += depositValue;
    }
    public double withdraw(double withdrawValue) {
        BankBalance -= withdrawValue;
        return balance -= withdrawValue;
    }
    public static double ConvertUSDToAUD(double usd) {
        return usd * 1.56;
    }
    

}
