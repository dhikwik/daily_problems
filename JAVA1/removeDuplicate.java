package JAVA1;
import java.util.*;
public class removeDuplicate {
    
// remove duplicate of sorted array

// can also use arr instead of temp

//for unsorted arr use Arrays.sort() to sort

    public static void hashh(int[] arr){
        Map<Integer, Integer> map1= new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            if(map1.containsKey(arr[i])){
                map1.put(arr[i], map1.get(arr[i])+1);
            }
            else{
                map1.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> map2:map1.entrySet()){
            
                System.out.print(map2.getKey()+"\n");
            }
        
            
           // map1.forEach((k,v)->System.out.print(k));
        }
        public static void set(int[] arr){
            Set<Integer> set = new HashSet<Integer>();
            for(int i=0;i<arr.length;i++){
                set.add(arr[i]);
            }
            set.forEach(ele -> System.out.print(ele));
        }
    

    public static void main(String[] args){
        
        int[] arr={5,7,2,8,3,9,4,5,2,3};
        Arrays.sort(arr);
        int n=arr.length-1;
        int[] temp=new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }

        }
        temp[j++]=arr[n];
        for(int k=0; k<j; k++){

        System.out.print(temp[k]+"\n");
    
        }
        hashh(arr);
        set(arr);

    }
    
}

    

