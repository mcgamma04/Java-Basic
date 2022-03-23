import OOPTutoria.abtractdemo.Bank;
import OOPTutoria.abtractdemo.GTB;
import OOPTutoria.abtractdemo.Zenit;
import OOPTutoria.interfacedemo.NestedImplem;
import OOPTutoria.polymorphismdemo.Car;
import OOPTutoria.polymorphismdemo.ComplIePoly;
import OOPTutoria.polymorphismdemo.Ferrari;
import Users.Register;
import algorithm.AlgoAtttemp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Register rr =  new Register();
        //rr.addUser();
//        System.out.println(rr.outPut());
        AlgoAtttemp atp = new AlgoAtttemp();
        boolean pali = atp.isValidPali("abca");
//        System.out.println(pali);
//        Employee emp =  new Employee();
//        emp.setAge(23);
//        emp.setFirstname("Mike");
//        emp.setLastname("Ade");
//        Manager mn =  new Manager();
//        boolean isap = true;
//       mn.setApprove(isap);
//        emp.output();
       // mn.output();
        //www.abc.com
        // Yoyu casn conact me on trhis email mcgamma@gmail.com
//        String word = "I love brown skin baby";
//        String [] wrd = word.split("\\.");
//        for(String s:wrd)
//            System.out.print(s);
        //System.out.println(atp.revEachWord("The sky is blue"));
       GTB gtb =  new GTB();
        Zenit zenith =  new Zenit();
//   double amt = 700.00;
//       gtb.deposit(amt);
//       zenith.deposit(amt);
        NestedImplem imp =  new NestedImplem();
//        imp.genotype();
        Car f = new Car();
        Ferrari ff =  new Ferrari();
//        f.run();
        ComplIePoly cp =  new ComplIePoly();
        cp.add(3);
        cp.add(3.4,2);




    }
}
