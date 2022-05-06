package equation;

public class Arithmetric {

    public int add(int a, int b){
        return a + b;
    }

    public String getName(String name){
        return "Hello " +name +"!";//Hello Jedi!
    }

    public String userAge(int age){
        String msg="";
        if (age < 18){
            msg = "Age is below standard";
        }else{
            msg= "Congratulation you are progress";
        }
        return msg;
    }
}
