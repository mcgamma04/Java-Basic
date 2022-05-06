package users;

import ooptutoria.inheritancedemo.Person;

import java.util.Scanner;

public class Register {
    Person pp =  new Person();
    public void addUser(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter Surname: ");
        pp.setSurname(scan.next());
        System.out.println("Enter Firstname: ");
        pp.setFirstname(scan.next());
        System.out.println("Enter Age");
        pp.setAge(scan.nextInt());
        System.out.println("Enter Gender");
        pp.setGender(scan.next());
        System.out.println("Enter Username");
        pp.setUsername(scan.next());
        System.out.println("Enter Password");
        pp.setPassword(scan.next());
        System.out.println("Enter Phone Number");
        pp.setPhoneNo(scan.next());
    }
    public String outPut() {
        return "Person{" +
                "surname='" + pp.getSurname() + '\'' +
                ", firstname='" + pp.getFirstname() + '\'' +
                ", gender='" + pp.getGender() + '\'' +
                ", age=" + pp.getAge() +
                ", username='" + pp.getUsername() + '\'' +
                ", password='" + pp.getPassword() + '\'' +
                ", phoneNo='" + pp.getPhoneNo() + '\'' +
                '}';
    }
}
