package collectiondemo;

public class Employee {
    private String firstname;
    private String lastname;
    private int age;

  public Employee(){}
    public Employee(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
    public String message(){
        return "Firstname "+firstname+"\nLastname: "+lastname+"\nAge: "+age;
    }
}


