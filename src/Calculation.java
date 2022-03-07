public class Calculation {
    public String namee = "Ade";
    public static int add(int a, int b){
        return a + b;
    }
    public String getName(String name){
        return "Hello, "+name+"\n We are so happy having you!";
    }

    //find Loan
    public static double Loan(double principal, double rate, double time){
         double interest;
         interest = (principal * rate * time);
         return  interest/100;
    }


}
