package ooptutoria.abtractdemo;

public class GTB extends Bank{
    @Override
    public void deposit( double amount) {

        System.out.println("tOTAL DEPOSIT AMOUNT FROM gtb "+amount);
    }

    @Override
    public void withdrawal( double amount) {

    }

    @Override
    public void transfer(String revaccount, String sendAccount, double amount) {

    }

}
