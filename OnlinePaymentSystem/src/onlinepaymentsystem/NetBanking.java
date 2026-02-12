package onlinepaymentsystem;

 class NetBanking extends  Payment{
     @Override
     public void pay(double amount){
         System.out.println("Payment method is CreaditCard");
         System.out.println("Amount is this: "+amount);
         System.out.println("Payment done!!");

     }

}
