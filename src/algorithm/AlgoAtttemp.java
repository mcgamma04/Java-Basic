package algorithm;

import java.util.Arrays;

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
    public String printDuplicate(int[] nums){
        String res="";
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                 res=res+nums[i];
                }
            }
        }
        return Arrays.toString(res.toCharArray());
    }

    public String freqCount (int [] number) {
        /*
            declare and initialize a string variable
            that will hold the numbers again
        */
        String seenNums = "";

        /*
            declare and initialize a string variable
            that will be returned when the program is finished
        */
        String last = "";

        // loop through the number array gotten
        for (int k : number) {

            /*
                declare and initialize an integer variable that
                will hold the number of times a number appear
            */
            int count = 0;

            // loop through the number array gotten again
            for (int i : number) {

                // increment count each time the number is found
                if (k == i) count++;
            }

            // continue if the number has been run through before
            if (seenNums.contains("" + k)) continue;

            // add number and it's count to the string to be returned

            last += k + ":" + count+",";

            // add number to seen numbers
            seenNums += k;
        }


        return last.substring(0,last.length() - 1);

    }

}
