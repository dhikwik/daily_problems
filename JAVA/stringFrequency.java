package JAVA;
import java.util.*;
//linkedhashmap maintains order
public class stringFrequency {
    public static void main(String[] args){
        String str="java";
        Map<Character,Integer> map= new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }
        System.out.println(map);
    }
    
}
