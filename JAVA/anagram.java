package JAVA;
import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 words");
        String str1= sc.nextLine();
        String str2= sc.nextLine();

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String newstr1 = new String(ch1);
        String newstr2 = new String(ch2);

        if(newstr1.equals(newstr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
    
}
// if two strings contains same characters, only the order character
//of character is different\

/* 1- sort nd compare
2-keep count of all character
*/