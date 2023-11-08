package CSC205_Week3_Wed;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       
        Bank myBank = new Bank();
        myBank.deposit(22.00);
        myBank.withdraw(10.00);
        System.out.println(myBank.getBalance());
    }
    
}