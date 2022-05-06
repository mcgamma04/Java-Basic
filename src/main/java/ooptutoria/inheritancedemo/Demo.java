package ooptutoria.inheritancedemo;


public class Demo {
    private String uname, Password;
    Demo(String uname, String Password){
        this.uname = uname;
        this.Password = Password;
    }
    public static void main(String[] args) {
        Demo obj1 = new Demo("King","Imaru");
        Demo obj2 = new Demo("Faithful","Jedi");
        Demo obj3 = new Demo("Isaac","Onyeka");
        System.out.println("Details of object 1");
        System.out.println("Usenamee: "+obj1.uname+"\npassword:"+obj1.Password);
        System.out.println("Details of object 2");
        System.out.println("Usenamee: "+obj2.uname+"\npassword:"+obj2.Password);
        System.out.println("Details of object 3");
        System.out.println("Usenamee: "+obj3.uname+"\npassword:"+obj3.Password);

    }

}
