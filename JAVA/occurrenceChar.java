package JAVA;
import java.util.*;
public class occurrenceChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        Map<Character,Integer> map1=new HashMap<Character,Integer>();
        for(Character c :str.toCharArray()){
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }
            else{
                map1.put(c,1);
            }
        }
        System.out.println(map1);

    }
    
}
