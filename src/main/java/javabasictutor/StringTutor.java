package javabasictutor;

import java.util.Arrays;
import java.util.Scanner;

public class StringTutor {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
      //  System.out.println("Length of the string = "+sample("Aptech Port Harcourt"));
//        System.out.print("Enter Password: ");
//        String passw;
//        passw = scan.next();
//        checkPasswor(passw);

        String word = "I love this";
        //charAt()
       // System.out.println(word.charAt(word.length()-1));
//        char[] wrd = word.toCharArray();
//        System.out.println(wrd[0]);

        //System.out.println(revString("hello"));
        //System.out.println(countVowels("FAithful"));
        //System.out.println(swapCaseAtOddPosition("MikE"));
        //System.out.println(CompressedString("ababab"));
       // System.out.println(palidrome("ebube"));
//        substring
        String ph = "Port Harcourt";
//        for(char str:ph.toCharArray())
//            System.out.println(str);
       // System.out.println(ph.substring(8));
        //indexof
        //System.out.println(ph.indexOf("j",8));
        //contains
        //System.out.println(ph.contains("Port"));
        //String username = "onyeka";
       // checkUsername("mike");
        String look ="I love to be here";
        //System.out.println(look.replaceAll("\s",""));
        System.out.println(look.replace("love","hate"));



    }
    //check username
    public static  void checkUsername(String str){
        if(str.equals("mike"))
            System.out.println("Nice job");
        else
            System.out.println("incorrct");

    }

//A program to check the length of a string
    public static int sample(String str){
        //string length
        return str.length();

    }
    //string Reverse
    public static String revString(String str){
//        StringBuilder sb =  new StringBuilder(str);
//       return sb.reverse().toString();
        char word[] = str.toCharArray();
        String res="";
        for(int i = word.length-1;i>=0;i--){
            res+=word[i];
        }
        return res;
    }
    //A program to count the vowels in a string
    public static int countVowels(String str){
        int count = 0;
        //char wrd[] = str.toCharArray();
        for(int i =0 ; i<str.length();i++){
            char c = str.charAt(i);
            c =     Character.toLowerCase(c);
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u')
                count++;

        }
        return count;
    }
    //A program to swapcase at an odd position
    public static String swapCaseAtOddPosition(String str){
        String result = "";
        String prex = " "+str;
        char[] letter= prex.toCharArray();
        for(int i=0; i<letter.length-1; i++){
            char s = Character.toLowerCase(letter[i]);
            char u = Character.toUpperCase(letter[i]);
            if(i % 2 !=0 && letter[i]==s){
                result+=u;
            }else{
                result+=s;
            }
        }
        return result.trim();
    }
    //build password
    public static  void checkPasswor(String pass){
        if(pass.length() < 5)
            System.err.println("Sorry length cannot be less than 5 character length");
        else
            System.out.println("Congratulations you can tyep k to continue");
    }

    // A program to compress string
   //a = a
    //aaa=>a3, zzzbbaa=>z3b2a2
    public static String CompressedString(String str){
        char [] news = str.toCharArray();
        Arrays.sort(news);
        int sum=1;
        String result ="";
        for(int i=0;i<news.length-1;i++){

                if(news[i]==news[i+1]) {
                    sum = sum + 1;
                }else {
                    result = result + news[i] + sum;
                    sum = 1;
                }
        }
        result = result+news[news.length-1]+sum;
        //System.out.println(result);
        return (result.length() < str.length())?result:str;
    }

    public static boolean palidrome(String str){
        str =  str.toLowerCase();
        StringBuilder build =  new StringBuilder(str);
        build.reverse();
        return build.toString().equals(str);

    }



}
