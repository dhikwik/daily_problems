package JAVA;
import java.util.*;
public class binaryserecursion {
    public static void recursion(int[] arr,int start,int end,int search){
        if(start>end){
            return;
        }
        int mid=(start+end)/2;
        if(arr[mid]==search){
            System.out.println(mid);
        }
        else if(arr[mid]>search){
            recursion(arr,start,mid-1,search);
    }
    else{
        recursion(arr,mid+1,end,search);
    }
}
    public static void main(String[] args){
        int[] arr={3,4,5,6,7,8,9};
        int start=0;
        int end=arr.length-1;
        Scanner sc=new Scanner(System.in);
        int search=sc.nextInt();
        recursion(arr,start,end,search);
    
    }
}
