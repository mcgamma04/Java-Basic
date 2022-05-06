package mutithreading;

public class ThreadDemo extends  Thread {
    public void run(){

        for(int i = 0;i<10;i++){
            System.out.println("Hello #"+i);
            try{
                sleep(1000);
            }catch (InterruptedException ie){
                ie.getMessage();
            }
        }
    }

}


