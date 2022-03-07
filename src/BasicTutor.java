import java.util.Scanner;

public class BasicTutor {
    public static void main(String[] args) {
        //System.out.println("This is aptech");
        Calculation cal = new Calculation();
        Scanner scan = new Scanner(System.in);
        double p,t,r;
        System.out.println("Enter Principal");
        p = scan.nextInt();
        System.out.println("Enter rate");
        r= scan.nextDouble();
        System.out.println("Enter duration");
        t = scan.nextInt();

        System.out.println("*****Loan Intrest calculate below******");
        System.out.println(cal.Loan(p,r,t));
        double tt = cal.Loan(p,r,t) + p;
        System.out.println("Total Load= "+ tt );


//        System.out.println(cal.namee);
//        System.out.println("Sum= "+cal.add(45,89));
       // System.out.println(cal.getName("King"));

    }
}
