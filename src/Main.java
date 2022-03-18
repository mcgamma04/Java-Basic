import OOPTutoria.Person;
import Users.Register;

public class Main {
    public static void main(String[] args) {
        Register rr =  new Register();
        rr.addUser();
        System.out.println(rr.outPut());
    }
}
