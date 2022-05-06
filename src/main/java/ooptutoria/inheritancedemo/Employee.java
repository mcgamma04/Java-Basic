package ooptutoria.inheritancedemo;

public class Employee {
    private String firstname;
    private String lastname;
    private int age;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
public void output(){
    System.out.println("Fistname: "+getFirstname()+"\nLastname: "+getLastname()+"\nAge: "+getAge());
}
}
