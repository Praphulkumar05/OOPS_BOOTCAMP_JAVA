package onlinepaymentsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Payment Option");
        System.out.println("1. Creadit Card");
        System.out.println("2. UPI");
        System.out.println("3. NetBanking");

        int a= sc.nextInt();
        System.out.println("Enter the amount");
        double  amount = sc.nextInt();
        Payment payment;
        if(a==1){
            payment= new CreaditCard();
        }else if (a==2){
            payment = new UPI();
        }else{
            payment= new NetBanking();
        }
        payment.pay(amount);






    }
}
