package collectiondemo;

import java.util.PriorityQueue;

public class QueueDemo {

    public void priorityDemo(){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=20;i>0;i--){
            queue.add(i);
        }
        System.out.println("Queue: "+queue);
        //head
        System.out.println();
        System.out.println("head of the queue: "+queue.peek());
        System.out.println("remove head: "+queue.poll());
        System.out.println("queue: "+queue);
        System.out.println("head of the queue: "+queue.peek());
        System.out.println("remove head: "+queue.poll());
        System.out.println("queue: "+queue);

    }

    public void being(){
        PriorityQueue<Persson> pp = new PriorityQueue<>();
        Persson p =  new Persson();
        p.setAge(23);
        p.setAge(40);
        p.setAge(18);
try {
    pp.add(p);
}catch (ClassCastException cce){
    System.out.println("unexpected error "+cce.getLocalizedMessage());
}

        System.out.println(pp);

    }
}
