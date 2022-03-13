package JAVA;
import java.util.*;
public class ocuurOdd {
    public static void main(String[] args) {
        int[] arr={3,4,5,4,3,4,4,4,3,2,2};
        /*for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) cnt++;
            }
            if(cnt%2!=0) {
                System.out.println(arr[i]);
                }
            */
        //hash map {} set[]
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> map1 : map.entrySet()){
            if(map1.getValue()%2!=0) {
                System.out.println(map1.getKey());
            }

        }
        
            


        }
    }
    

