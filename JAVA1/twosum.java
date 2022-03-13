package JAVA1;
import java.util.*;
public class twosum {
    public static void main(String[] args){
        int[] arr={1,3,4,5,6,7,8,9};
        int low=0;
        int high=arr.length-1;
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        while(low<high){
            if(arr[low]+arr[high]>sum){
                high--;
            }
            else if(arr[low]+arr[high]<sum){
                low++;
            }
            else if(arr[low]+arr[high]==sum){
                System.out.println(arr[low]+","+arr[high]);
                low++;
                high--;
            }
        }
    }
    
}
