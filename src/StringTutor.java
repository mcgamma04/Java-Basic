import java.sql.SQLOutput;
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
        System.out.println(CompressedString("aaabccc"));
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

    public static String CompressedString(String str){
        int sum=1;
        String result ="";
        for(int i=0;i<str.length()-1;i++){

                if(str.charAt(i)==str.charAt(i+1)) {
                    sum = sum + 1;
                }else {
                    result = result + str.charAt(i) + sum;
                    sum = 1;
                }
        }
        result = result+str.charAt(str.length()-1)+sum;
        System.out.println(result);
        if(result.length() < str.length())
            return  result;
        else
            return str;
    }



}
