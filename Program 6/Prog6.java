package com.company;
import java.util.Scanner;
import static java.lang.System.*;
class DemonetizationException extends Exception{
    DemonetizationException(int amt){
        out.println("Deposit of Old currency of Rs." + amt + " crosses Rs. 5,000 and cannot be Deposited\n");
    }
}
class Account{
    int balance;
    String currencyType;
    Account(){
        balance = 500;
        //currencyType = "NEW";
    }
    void deposit(int amount, String CurrencyType) throws DemonetizationException{
        if (CurrencyType.equals("OLD") && (amount > 5000))
            throw new DemonetizationException(amount);
        else{
            this.balance += amount;  this.currencyType = CurrencyType;
            out.println("Amount Deposited !!\n");
        }
    }
    void withdraw(int amt){
        if ((this.balance - amt) < 500){
            out.println("Insufficient balance !!! Cannot withdraw amount\n");
        }
        else{
            this.balance -= amt;
            out.println("Amount Withdrawed Successfully!!\n");
        }
    }
    void currBalance(){
        out.println("\nBalance = Rs."+this.balance+"\n");
    }
}
class Customer{
    Account A = new Account();
    public void getOption(int op) throws DemonetizationException {
        Scanner s = new Scanner(System.in);
        switch (op){
            case 1 : out.println("Enter the Amount to be deposited along with Currency Type :-");
                     try{
                     A.deposit(s.nextInt(),s.next());}
                     catch (Exception e){}
                     break;
            case 2 : out.print("Enter the withdrawal amt. : ");
                     A.withdraw(s.nextInt());
                     break;
            case 3 : A.currBalance();
                     break;
            case 4 : exit(0);   break;
            default: out.println("INVALID OPTION");
        }
    }
}
public class Prog6 {
    public static void main(String args[]) throws DemonetizationException {
        Customer C = new Customer();
        Scanner S = new Scanner(System.in);
        out.println("--------------BANK ACCOUNT------------\n\n");
        while (true){
            out.print("Enter your Choice:-\n1.Deposit\n2.Withdrawal\n3.Check Balance\n4.Exit\n: ");
            try{
            C.getOption(S.nextInt());}
            catch (Exception e){}
        }
    }
}