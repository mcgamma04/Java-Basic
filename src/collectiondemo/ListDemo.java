package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ListDemo {

    //ArrayList
    public void people(){
        ArrayList<String> person = new ArrayList<String>();
        //add to the list
        person.add("Kingg");
        person.add("Faithful");
        person.add("Michael");
        person.add("Isaac");
//        System.out.println(person.get(person.size()-1));
//        System.out.println(person.get(0));
//        for(String s:person){
   String str="";
        for(int i=0;i<person.size();i++){
          if(i==person.size()-1){
             str = str+person.get(i);
            }else{
//              System.out.println(person.get(i)+",");
              str = str+person.get(i)+",";
          }
        }
        System.out.println(Arrays.asList(str));

}
}
