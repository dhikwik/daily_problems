package JAVA1;
import java.util.*;
public class queueUsing2Stack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void enqueue(int n){
        stack1.push(n);
    }
    public void dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                System.out.println("Queue is empty");
            }
            else{
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }

        }
        System.out.println(stack2.pop());
    }
    public static void main(String[] args){
        queueUsing2Stack que = new queueUsing2Stack();
        que.enqueue(2);
        que.enqueue(6);
        que.dequeue();
        que.enqueue(8);
        que.dequeue();
        que.enqueue(9);
        que.dequeue();
        que.enqueue(23);
        que.dequeue();
        que.enqueue(24);
        que.dequeue();
        que.enqueue(82);
        

        

    }
    
}
