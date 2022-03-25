package ooptutoria.abtractdemo;

public class Zenit extends Bank {
    @Override
    public void deposit(double amount) {

        System.out.println("Deposit from zENITH Amount = "+amount);
    }

    @Override
    void withdrawal(double amount) {

    }

    @Override
    void transfer(String revaccount, String sendAccount, double amount) {

    }
}
