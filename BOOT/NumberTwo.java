//Small banking System..

import java.util.*;
class BankAccount{
    private  int accountNumber;
    private String accountHolderName;
    private double balance;
    private double withdrawAmount;;


    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
      return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountBalance(double balance){
       this.balance=balance;
    }
    public double getAccountBalance(){
        
        return balance;
    }

    public void setDeposite(double balance  ,double amount){
        this.balance+=amount;
        

    }
    public double getDeposite(){
        return balance;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insuffient balance");
        }
        withdrawAmount=amount;
        balance-=amount;
    }
    public double getWithdrawAmount(){
        return withdrawAmount;
    }





}

public class NumberTwo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountBalance(10000);
        b.withdraw(100000);



     
       



        
       

       


       
       
    }
    
}
