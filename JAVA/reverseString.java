package JAVA;
import java.util.*;
// using stack
public class reverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str= sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));

        }
        System.out.println("Reverse String ");
        while(!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
