package JAVA;
//import java.util.*;

public class secondlargest {
    public static void main(String[] args){
        int arr[] ={4,5,77,66,4,33,22,34,44,333};
        int n=arr.length;
        //Arrays.sort(arr);
        int high=arr[0];
        int sechigh=arr[1];
        for(int i=0; i<n; i++){
            if(arr[i]<high && arr[i]>sechigh){
                sechigh=arr[i];

            }

        }
        System.out.println(sechigh);
        //System.out.println(arr[n-2]);
}
    
}
