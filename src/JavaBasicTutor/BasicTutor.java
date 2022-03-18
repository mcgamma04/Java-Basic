package JavaBasicTutor;

import java.util.Scanner;

public class BasicTutor {
    public static void main(String[] args) {
        //System.out.println("This is aptech");
        Calculation cal = new Calculation();
        Scanner scan = new Scanner(System.in);
//        double p,t,r;
//        System.out.println("Enter Principal");
//        p = scan.nextInt();
//        System.out.println("Enter rate");
//        r= scan.nextDouble();
//        System.out.println("Enter duration");
//        t = scan.nextInt();
//
//        System.out.println("*****Loan Intrest calculate below******");
//        System.out.println(cal.Loan(p,r,t));
//        double tt = cal.Loan(p,r,t) + p;
//        System.out.println("Total Load= "+ tt );

        //get age
//        System.out.println("Please enter your age");
//        int age = scan.nextInt();
//        cal.age(age);

        //get score
//        int score;
//        System.out.println("Enter score: ");
//        score = scan.nextInt();
//        char gg = cal.getGrade(score);
//        if(gg=='o'){
//            System.out.println("Out of Bound");
//        }else{
//            System.out.println(gg);
//        }


//        System.out.println(cal.namee);
//        System.out.println("Sum= "+cal.add(45,89));
       // System.out.println(cal.getName("King"));


        //tennis task
//        int p,c;
//        System.out.println("Enter number of players: ");
//        p = scan.nextInt();
//        System.out.println("Enter numbr of Court: ");
//        c = scan.nextInt();
//        System.out.println(cal.solution(p,c));

       // System.out.println(cal.gradeSwitch(80));
       // cal.output();
        cal.quadraticSoution(2,4,1);
    }
}
