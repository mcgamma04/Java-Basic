package errorpackage;

public class Uncheeck {

    public  void average(int points, int attemps){
        try {
            System.out.println("Average: "+ points / attemps);
        }catch (ArithmeticException ar){
            System.err.println("Division by zero is not alowed");
        }

    }
}
