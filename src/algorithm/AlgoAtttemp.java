package algorithm;

public class AlgoAtttemp {

    public boolean isValidPali(String str){
        int start = 0;
        int end = str.length()-1;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return palidrone(str,start+1,end) || palidrone(str,start,end-1);
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean palidrone(String str,int start, int end ){
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
