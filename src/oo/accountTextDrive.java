package oo;

}
public class accountTextDrive {
    public static void main(String[] args) {
      account account;
      account = new account();
      
      account.show();
      account.deposit(50000);
      account.show();

      account.withdraw(30000);
      account.show();
   }
}