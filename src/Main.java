import arraytuto.ArrayDemo;
import collectiondemo.Employee;
import collectiondemo.ListDemo;
import collectiondemo.QueueDemo;
import collectiondemo.SetDemo;
import errorpackage.Uncheeck;
import ooptutoria.abtractdemo.GTB;
import ooptutoria.abtractdemo.Zenit;
import ooptutoria.inheritancedemo.Person;
import ooptutoria.interfacedemo.NestedImplem;
import ooptutoria.polymorphismdemo.Car;
import ooptutoria.polymorphismdemo.ComplIePoly;
import ooptutoria.polymorphismdemo.Ferrari;
import users.Register;
import algorithm.AlgoAtttemp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Register rr = new Register();
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
        GTB gtb = new GTB();
        Zenit zenith = new Zenit();
//   double amt = 700.00;
//       gtb.deposit(amt);
//       zenith.deposit(amt);
        NestedImplem imp = new NestedImplem();
//        imp.genotype();
        Car f = new Car();
        Ferrari ff = new Ferrari();
//        f.run();
        ComplIePoly cp = new ComplIePoly();
//        cp.add(3);
//        cp.add(3.4,2);
        ArrayDemo ard = new ArrayDemo();
        //ard.findMinAndMax(101,34,67,89,1000);
        int[] nums = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
//        System.out.println(atp.printDuplicate(nums));
        // System.out.println(atp.freqCount(nums));
        //System.out.println(atp.isValidSubString("pqrstyu","rspu"));
        ListDemo ld = new ListDemo();
        //ld.people();
        //ld.numbers();
//        ArrayList<String> it =  new ArrayList<>();
//        it.add("mike");
//        it.add("milk");
//        it.add("fanta");
//        it.add("mouse");
//        it.add("keyboard");
//        ld.myitems(it);

        QueueDemo qd = new QueueDemo();
        // qd.priorityDemo();
//        for(int i=20;i>0;i--){
//            System.out.println(i);
//        }

//         qd.being();

        SetDemo sd = new SetDemo();
        //sd.setExample();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Point: ");
//        int pt =  scanner.nextInt();
//        System.out.println("Enter Attempts: ");
//       int at =  scanner.nextInt();
//        new Uncheeck().average(pt,at);

//        int[] num =  {34,6,78};
//        try {
//            System.out.println(num[4]);
//        }catch (ArrayIndexOutOfBoundsException | ArithmeticException aa){
//            System.out.println("The element does not exits ");
//        }finally {
//            System.out.println("Problem resolved");
//        }

//        ld.myNumbers();
        Employee ee = new Employee();
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Adebayo", "Michael", 17));
        emp.add(new Employee("Noble", "Agbaeze", 18));
        emp.add(new Employee("Jedi", "Bsssey", 20));
        emp.add(new Employee("John", "Ballack", 36));
        //System.out.println(emp);

        Iterator itr = emp.listIterator();
        //System.out.println(itr.next());
//        while(itr.hasNext()){
//           // String pp = (String) itr.next();
////            if(pp.equals(ee.getFirstname()))
//           // System.out.println(itr.next());
//        }
//
//        Employee[] mypeople = emp.toArray(new Employee[emp.size()]);
//        System.out.println("");
//        for (int i = 0; i < mypeople.length; i++) {
//            if(mypeople[i].getAge()<=18){
//            System.out.println(mypeople[i].message());
//            System.out.println("");
//        }}

        //Hashmap is thread safe

        Map<String,String> person = new HashMap<>();
        person.put("firstname","Michael");
        person.put("Lastname","Adebayo");
        person.put("Age",String.valueOf(25));
        person.put("Lastname","Deborah");
        if(person.values().contains("Michael")){
            System.out.println("yes ");

        }else{
            System.out.println("no");
        }
//        System.out.println(person.values());
       // System.out.println(person);

    }
}