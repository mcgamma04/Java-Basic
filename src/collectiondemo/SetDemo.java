package collectiondemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

    public void setExample() {
        HashSet<String> hs = new HashSet<>();
        hs.add("Jedi");
        hs.add("Faith");
        hs.add("King");
        hs.add("Mike");
        hs.add("Jedi");
        hs.add("Solomon");
        hs.add("Mike");
        hs.add("Ade");
        hs.add("Bola");
        hs.add("Eket");
        System.out.println(hs);
        Iterator itr =  hs.iterator();
        System.out.println(itr.next());
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
