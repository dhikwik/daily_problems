package JAVA1;
import java.util.*;
public class duplicatElement {
    public static void main(String[] args){
        Set<Integer> set= new HashSet<>();
        int[] arr={3,6,8,6,4,3,9,2};
        Boolean dup=false;
        for(int i=0;i<arr.length;i++){
            
            if(set.contains(arr[i])){
                dup=true;
                System.out.println("duplicate"+arr[i]);
            }
            else{
                set.add(arr[i]);
            }
             
        }
        if(!dup){
            System.out.println(-1);
        }
    }
    
}
