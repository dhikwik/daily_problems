package JAVA;

import java.util.HashSet;

public class intersectionOfArray {
    public static void main(String[] args){
        int[] arr1={4,5,6,8,97};
        int[] arr2={5,6,4,2,3,2};
      /*  for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr2[j]);
                }
            }
        }*/

        // 2nd method o(m+n)
        /*
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.println(arr2[j]);
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }*/
        HashSet<Integer> set1 =new HashSet<>();
        for(int a:arr1){
            set1.add(a);
        }
        for(int a:arr2){
            if(set1.contains(a)){
                System.out.println(a);
            }
        }
    }
    
}
