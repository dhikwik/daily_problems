package JAVA;
import java.util.*;
// fo normal swap
public class reversearray {

    public static void reversearr(int arr[], int start, int end){
        // terminating conditions 
        if(start>=end){
            return;
        }
        int temp;
        
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
        reversearr(arr,start+1,end-1);
    }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter");
      int n=sc.nextInt();

      System.out.println("Enter Values");
      int[] arr =new int[n];
      for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

      }
      // call the fun
      reversearr(arr,0,n-1);

      //print
      for(int i=0;i<n;i++){
      System.out.println(arr[i]); 
      }
  }  
}
