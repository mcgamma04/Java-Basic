package ooptutoria.inheritancedemo;

public class Being {
    private String firstname;
    private String lastname;
    private String age;

    public Being(String firstname, String lastname, String age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void output(){
        System.out.println("Fistname: "+getFirstname()+"\nLastname: "+getLastname()+"\nAge: "+getAge());
    }
}

class Student extends Being{
    private String matricNo;
    private String stid;

    public Student(String firstname, String lastname, String age, String matricNo, String stid) {
        super(firstname, lastname, age);
        this.matricNo = matricNo;
        this.stid = stid;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    public String getStid() {
        return stid;
    }

    public void setStid(String stid) {
        this.stid = stid;
    }
    public void output(){
        super.output();
        System.out.println("Student Matno: "+getMatricNo());
    }
}

class ManagerT extends Being{
    private double salary;

    public ManagerT(String firstname, String lastname, String age, double salary) {
        super(firstname, lastname, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void output(){
        super.output();
        System.out.println("Salary: "+getSalary());
    }
}

class Main{
    public static void main(String[] args) {
//sTUDENTS INFO
        System.out.println("Students Info");
        Being bS = new Student("Mike","Adebayo","23","5570/2020/192","1234");

        bS.output();
        System.out.println("-----------------------------");
        //MANAGER
        Being bM = new ManagerT("King","Jacob","23",3000.00);
        System.out.println("*****Manager Information******");

        bM.output();

    }
}