package JAVA1;
import java.util.*;
public class balancedParanthesis {
    public static void main(String[] args){
        String str="{[]}()";
        Stack<Character> sta = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                sta.push(str.charAt(i));
            }  
            else if(!sta.empty() && ((str.charAt(i)=='}'&& sta.peek()=='{')
            || (str.charAt(i)==']' && sta.peek()=='[')|| (str.charAt(i)==')' && sta.peek()=='(')

            )){
                sta.pop();

            }else{
                sta.push(str.charAt(i));


        }}
        if(sta.empty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }

    }
    
}
