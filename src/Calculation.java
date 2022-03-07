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

public static int solution(int p,int c){
        if(p/2 > c){
            return c;
        }else{
           return (int)Math.floor(p/2);
        }
}

}
