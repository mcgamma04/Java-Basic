import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Scanner;

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
//condition opertaor and, or and not

    void age(int age){
        if(age >=18) System.out.println("You are eligigble to vote");
        else System.out.println(" Sorry! you are not eigibe becuase you are "+(18-age)+" years below required age");
    }
//if, else if else
    public static char getGrade(int score){
        char grade;
        if(score >= 70 && score <=100){
            grade = 'A';
        }else if(score >=60 && score <70){
            grade = 'B';
        }else if(score >=50 && score <60){
            grade = 'C';
        }else if(score >=40 && score <50){
            grade = 'D';
        }else if(score >=0 && score <40){
            grade = 'F';
        }else{
            grade= 'o';
        }
        return grade;
    }
public  String gradeSwitch(int score){
        String grade = "";
        switch (score){
           // case (int) score >=70 && score <=100:
            case 70:
                grade="A";
                break;
            case 60:
                grade = "B";
                break;
            case 50:
                grade = "C";
                break;
            default:
                grade="Grade is out of bound";
        }
        return grade;
}

//please select from menu
    public void output(){
        Scanner cyrill =  new Scanner(System.in);
        System.out.println("******Please select rom the list below********");
        System.out.println("1: getUsername\n2: Add\n3: Exit");
        System.out.println("******************************");
        int input = cyrill.nextInt();
        switch (input){
            case 1:
                System.out.println(" Enter your name");
                String name =  cyrill.next();
                System.out.println(getName(name));
                break;
            case 2:
                System.out.println("Enter first number: ");
                int a =  cyrill.nextInt();
                System.out.println("Enter second Number: ");
                int b = cyrill.nextInt();
                System.out.println(add(a,b));
                break;
            default:
                System.err.println("Inavid input. Try again");
                System.exit(0);

        }
    }

public static int solution(int p,int c){
        if(p/2 > c){
            return c;
        }else{
           return (int)Math.floor(p/2);
        }
}

public static void quadraticSoution(int a, int b, int c){
        double d,x1,x2;
        d = b*b-4*a*c;
        if(d==0){
            System.out.println("equal roots");
            x1 = (-b/(2*a));
            x2 = x1;
            System.out.println("x1="+ x2+" x2= "+x2);
        }else if(d > 0){
            System.out.println("Real Roots");
            x1 = (-b-Math.sqrt(d))/(2*a);
            x2 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("x1="+ x1+",x2= "+x2);
        }else{
            System.out.println("Complex Roots");

        }
}

}
