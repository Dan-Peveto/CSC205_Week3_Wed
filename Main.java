package CSC205_Week3_Wed;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       /* 
        Bank myBank = new Bank();
        //System.out.println(myBank.deposit(22.00));
        //System.out.println(myBank.withdraw(10.00));
        System.out.println(myBank.getBalance());
        System.out.println(myBank.AuthorizedUser);
        System.out.println(myBank.AccountType);
        System.out.println(myBank.getBalance());
        Bank danAccount = new Bank("Dan");
        System.out.println("Authorized User for Dan Account: " + danAccount.AuthorizedUser);
        System.out.println("danAccount type: " + myBank.AccountType);
        Bank kanAccount = new Bank("Kandyce", 22.22);
        System.out.println("KanAccount Authorized User: " + kanAccount.AuthorizedUser);
        System.out.println("kanAccount Account Balance: " + kanAccount.getBalance());
        Bank yourBank = new Bank("NoBody", 1000);
        Bank ourBank = new Bank("SomeBody", 500);
        System.out.println("yourBank Balance " + yourBank.getBalance());
        System.out.println("our bank balance: " + ourBank.getBalance());
        System.out.println("The bank balance " + Bank.getBankBalance());
        System.out.println(Bank.ConvertUSDToAUD(Bank.getBankBalance()));
        */
        
        sqRoot();
    }
    // write a method that ask user for input number and then displays sqroot
    public static void sqRoot() {
        
        Scanner inputNum = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int num = inputNum.nextInt();
            System.out.println("The Sq Root of your number is: " + Math.sqrt(num));
        } catch(InputMismatchException e) {
            System.out.println("Please make sure to enter an integer");
        }
        inputNum.close();
    }
}