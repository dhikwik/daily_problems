package JAVA;
import java.util.*;
public class maxAndMin {
    public static void main(String[] args){
        int[] arr={5,7,3,8,9,2,1};
        //Arrays.sort(arr);
        //System.out.println("minimum"+arr[0]+" and maximum"+arr[arr.length-1]);
        int min=arr[0];
        int max=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min"+min+" and max"+max);
    }
    
}
