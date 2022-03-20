package JAVA1;
import java.util.*;
public class nextGreaterStack {

    public static void nextGreater(int[] arr){
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(st.isEmpty()){
                st.push(arr[i]);

            }
            else{
                while(!st.isEmpty() && st.peek() < arr[i]){
                    System.out.println(st.peek()+ "next greater is"+arr[i]);
                    st.pop();
                }
                st.push(arr[i]);
            }
        }

        while(!st.isEmpty()){
            System.out.println(st.peek()+ "next greater is null" );
            st.pop();
        }

    }
    public static void main(String[] args){
        int arr[]={3,5,7,5,8,6,5};
        nextGreater(arr);
    }
    
}
