package ooptutoria.inheritancedemo;

public class Manager extends  Employee{
    private boolean isApprove;

    public boolean isApprove() {
        return isApprove;
    }

    public void setApprove(boolean approve) {
        isApprove = approve;
    }

    public void output(){
       System.out.println("Transaction Status: "+isApprove());
   }
}
