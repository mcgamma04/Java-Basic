import java.util.Scanner;

public class LoopDemo {
 Scanner  scan2 =  new Scanner(System.in);
    public static int sumAll(int start,int end){
        int sum = 0;
        for(int i = start; i<=end;i++){
            sum +=i;
        }
        return sum;
    }

    public void simpleMul(int num,int end){
        for(int i=1; i<=end;i++){
            System.out.println(num +"*"+i+"="+num * i);
        }
    }
    //nested for loop
    public void mulTable(int end){
        for(int i=1; i<=end;i++){


            for(int j=1;j<=end;j++){
                System.out.print(i*j+"\t\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        LoopDemo lpd = new LoopDemo();
        Scanner scan =  new Scanner(System.in);
//        //System.out.println(lpd.sumAll(1,3));
//        System.out.print("Enter the num: ");
//        int num = scan.nextInt();
//        System.out.print("Enter the end: ");
//        int end =  scan.nextInt();
//
//        lpd.simpleMul(num,end);
        //lpd.mulTable(6);
//        System.out.println(fac(5));
       // System.out.println("sum= "+lpd.whileDemo());
//        lpd.addNaturalNum();
      //  lpd.doWhileDemo();
        lpd.output2();
    }

    public static int fac(int num){
        int prod = 1;
        if(num<=2){
            return num;
        }
        for(int i = num;i>0;i--){
            prod = prod * i;
        }
      return prod;
    }

    //while loop
    public static  int whileDemo(){
        int sum = 0;
        int i=1;
        while(i <=5){
            sum = sum + i;
            i++;
        }
        return  sum;
    }
//interative

    void addNaturalNum(){

        int sum = 0;
        System.out.println("****Please enter any number to add.\n 0: End****");
        int i = scan2.nextInt();
        while(i !=0){
            sum =  sum +i;
            i = scan2.nextInt();
        }
        System.out.println("Sum= "+sum);
    }

    public  void doWhileDemo(){
        int i =5;
        do{
            System.out.println("I love Bayelsa People" +i);
            i++;
        } while(i <= 20);

    }

    public void output2(){
        String option;
        do{
            System.out.println("***Please select frpm menu below:****");
            System.out.println(">>  1: factorial     <<");
            System.out.println(">>  2: dowhile Loop  <<");
            System.out.println(">>  3: Mul Table     <<");
            System.out.println(">>  4: addNaturalNum <<");
            System.out.println(">>  5: Exit          <<");
            int input = scan2.nextInt();
            switch (input){
                case 1:
                    System.out.print("Enter a number for tyhe factorial: ");
                    int fa = scan2.nextInt();
                    System.out.println( fac(fa));
                    break;
                case 2:
                    doWhileDemo();
                    break;
                case 3:
                    System.out.print("Enter an end number: ");
                    int end = scan2.nextInt();
                    mulTable(end);
                    break;
                case 4:
                    addNaturalNum();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Wrong input....");

            }
            System.out.println("Do you really want to try another operion? (yes/no)");
             option = scan2.next();

        }while(option.equalsIgnoreCase("yes")|| option.equalsIgnoreCase("y"));
    }


}
