class BankAccount{
  private String accountHolder;
  private double balance;
  public void getAccountHolder(){
    System.out.println("Account Holder name: "+accountHolder);
  }

  public void setAccountHolder(String name){
    accountHolder=name;
  }

  public void setBalance(double amount){
    if(amount<0){
      System.out.println("Invalid Balance"); 
    }
    else{
      balance=amount;
    }
  }
  public void getBalance(){
    System.out.println(balance);
  }
  public void deposit(double amount){
    if(balance>0){
    balance+=amount;
    System.out.println("Deposited Amount"+ amount);
    }
    else{
      System.out.println("Invalid deposit amount");
    }
  }
  public void withdraw(double amount){
    if(amount>0 && amount <= balance){
      balance-=amount;
      System.out.println("Amount withdrawn: "+ amount);
    }
    else{
      System.out.println("Invalid amount");
    }
  }

}

public class Main3 {
  public static void main(String[] args) {
    BankAccount b = new BankAccount();
    b.setAccountHolder("swetha");
    b.getAccountHolder();
    b.setBalance(30000);
    b.getBalance();

    b.setBalance(-20000);
    b.deposit(2000);
    b.withdraw(1000);
    b.withdraw(50000);
    b.getBalance();

  }
}


