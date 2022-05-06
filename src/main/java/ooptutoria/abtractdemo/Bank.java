package ooptutoria.abtractdemo;

public abstract class Bank {

    abstract void deposit(double amount);
    abstract void withdrawal(double amount);
    abstract  void transfer(String revaccount, String sendAccount,double amount);
    public void message(){
        System.out.println("SMS alert activated");
    }
}
