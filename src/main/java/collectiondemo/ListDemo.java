package collectiondemo;

import java.util.*;

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
        //size of arrayList person


}

public void numbers() {
    int[] no = {2, 4, 6,56, 7, 8};
    LinkedList<Integer> nums = new LinkedList<>();
    for (int i = 0; i < no.length; i++) {
        nums.addAll(i, Collections.singleton(no[i]));
    }
//remove element

    if(nums.contains(7)){
        nums.remove(nums.indexOf(7));
}


    System.out.println(nums);
//   System.out.println(nums.size());
    //printelement
    //System.out.println(nums.get(nums.size()-1));
    //even
    int res = nums.get(0);
    // System.out.println("Eveen Elements: ");
    for (int myeven : nums) {
//        if(myeven % 2 == 0)
////            System.out.println(myeven);
//
//    }

    }
    System.out.println("Reverse List");
    Collections.reverse(nums);
    System.out.println(nums);
    //higest numbwers
   Collections.sort(nums,Collections.reverseOrder());
    System.out.println(nums.get(0));
}

public void myitems(ArrayList<String> list){
    //Iterator
    Iterator itr =  list.iterator();
    //System.out.println(itr.next());
    while(itr.hasNext()){
        String st = (String) itr.next();
      if (st.equals("mike")){
          itr.remove();
      }

    }
    System.out.println(list);

}

//CRUD
    public void myNumbers(){
        ArrayList<Integer> al =  new ArrayList<>();
        for(int i=0;i<=12;i++){
            al.add(i,i+5);
        }
        for(int num: al){
            System.out.println(num);
        }
        //remove element
        if(al.contains(6)){
            System.out.println(al.remove(al.indexOf(6)));
        }
        //update
        al.set(al.size()-1,177);
        System.out.println("after removed last element "+al);
        System.out.println("Removed elements");
        System.out.println(al);
        //prnt spect elemnts\
        System.out.println("specific : "+al.get(al.indexOf(11)));
        //Convert to array
        Integer[] numarr = al.toArray(new Integer[al.size()]);
//        for(int nm : numarr)
//            System.out.println(nm);
        System.out.println("Last element");

        System.out.println(numarr[numarr.length-1]);
    }

}
