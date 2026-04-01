class BankAccount{
    private double balance;
    public void setbalance(double balance){
        if(balance>0){
            this.balance=balance;
        }
        else{
            System.out.println("Input not valid");
        }
    }
    public double getbalance(){
        return balance;
    }
    public void withdraw(double amount){
        if(balance>=amount && amount>0){
            balance-=amount;
            System.out.println("amount debited:"+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }

}

public class Encapsulation{
    public static void main(String[] args){
        BankAccount b=new BankAccount();
        b.setbalance(4000);
        b.withdraw(1000);
        System.out.println(b.getbalance());
    }
}