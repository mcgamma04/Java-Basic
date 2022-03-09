import java.util.Scanner;

public class LoopDemo {

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
        lpd.mulTable(6);
    }
}
