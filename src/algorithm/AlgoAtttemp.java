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

    //Reverse each word in a sentencs

    public String revEachWord(String str){
        String space =" ";
        String eachwrd = "";
        String [] word = str.split("\\s");
        for(int i = word.length-1; i>=0;i--){
            eachwrd = eachwrd + word[i]+space;
        }
        return  eachwrd;
    }
}
