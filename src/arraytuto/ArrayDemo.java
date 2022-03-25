package arraytuto;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo {

//    public int[] numbers(int[] nums){
//
//    }

    public static void main(String[] args) {
        //initialize array
        int[] numbers = new int[4];
        //assign values]
        numbers[0]=23;
        numbers[1]=18;
        numbers[2]=32;
        numbers[3]=67;
        //dislay array elements
//        System.out.println(Arrays.toString(numbers));
//        //access array elements with loop
//        System.out.println("With For loop: ");
//        for(int i=0; i<numbers.length;i++){
//            System.out.print(numbers[i]+" ");
//        }
//        System.out.println();
//        //access the array using an enhanced for loop
//        System.out.println("With enhanced Foor Loop: ");
//        for(int num:numbers){
//            System.out.print(num
//            +" ");
//        }
//        System.out.println();
//        //with index
//        System.out.println(numbers[numbers.length-1]);
//        System.out.println("Update array at index 1");
////update array
//        numbers[1] = 90;
//        System.out.println(Arrays.toString(numbers));
//        //sort arrays
//        System.out.println("Sort an array from smallest to highest");
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        //

        //get minimum and max array elements
        //1)Sort
//        Arrays.sort(numbers);
//        System.out.println("Using Sort()\nmin: "+numbers[0]+"\nMax: "+numbers[numbers.length-1 ]);
//        int min = Arrays.stream(numbers).min().getAsInt();
//        int max =  Arrays.stream(numbers).max().getAsInt();
//        System.out.println("using Streams Method()\n Min: "+min+"\nMax: "+max);

        //usng sumary statistics
//        System.out.println("Using summaryStatistics");
//        IntSummaryStatistics result = Arrays.stream(numbers).summaryStatistics();
//        System.out.println("Min: "+result.getMin()+"\nMax: "+result.getMax());

        //Sort an array without built method

//        int min = numbers[0];
//        int max = numbers[0];
//        for(int i=0; i<numbers.length;i++){
//            if(numbers[i]>max){
//                max = numbers[i];
//            }else if(numbers[i] < min){
//                min = numbers[i];
//            }
//        }
//        System.out.println("Min: "+min+"\nMax: "+max);

        //Sort in reverse with range
//        Arrays.sort(numbers , 0,2);
//        System.out.println(Arrays.toString(numbers));
        //ANOTHER WAY
//        int nums[] = {78,90,34,54,201};
//        Arrays.sort(nums,Collections.reverseOrder());
        Integer[] nums =  {78,90,34,54,201};
//        Arrays.sort(nums,Collections.reverseOrder());
//        System.out.println(Arrays.toString(nums));

        //use fills()


    }

    public void findMinAndMax(int...numbers){
        int min = numbers[0];
        int max = numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }else if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Min: "+min+"\nMax: "+max);

    }
}
