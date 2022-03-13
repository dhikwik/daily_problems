package JAVA;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("no of array elements");
        int n=sc.nextInt();
        //declare array
        int[] arr= new int[n];
        System.out.println("array values");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("value to search");
        int num=sc.nextInt();
        int low=0;
        int high=n-1;
        int mid=0;
        
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                System.out.println("value at index"+mid);
                break;
            }
            else if(arr[mid]>num){
                high=mid-1;
            }
            else if(arr[mid]<num){
                low=mid+1;
            }
        }
        if(low>high){
            System.out.println("Value not found");
        }

    }
}
/*
low=0 , high =size-1, search=x

while(low<=high){
    mid=(low+high)/2;
    if(arr[mid]==search){
        return
    }
    else if(search>ar[mid]){
        low=mid+1;
    }
    else if(search<ar[mid]){
        high=mid-1;
    }
}
*/