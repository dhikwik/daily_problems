package JAVA;
import java.util.*;
public class nextgreater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            //System.out.println("i - " + arr[i]);
            int grt=0;
            for(int j=1;j<n;j++){
                if(arr[i]<arr[j]){
                    System.out.println("j - "+ arr[j]);
                    grt=arr[j];
                    break;
                }
            }
            System.out.println(grt+"is the next greater element of" + arr[i]);
        }
    }
    
}
