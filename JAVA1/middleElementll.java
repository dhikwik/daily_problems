package JAVA1;



//import java.util.*;
// linkedlist has 3 methods
class Node{

    int data;
    Node next;
    public Node(int data) {
        this.data=data;
        this.next=null;

    }
}

public class middleElementll {
    public Node head;

    public middleElementll(){
        this.head=null;

    }

    public Node insertAtHead(int data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node temp = new Node(data);
            temp.next=head;
            head=temp;
        }
        return head;
    }

    public void print(){
        Node temp=head;
        while(temp!= null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    // 2 pointers slow nd fast  Fast goes 2 steps slow goes 1 step when fast reaches null pointer
    // slow will be in middle
    public void printMiddleElement(){
        Node slow=head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
        public static void main(String[] args){
            middleElementll ll =new middleElementll();

             ll.insertAtHead(4);
             ll.insertAtHead(5);
             ll.insertAtHead(6);
             ll.insertAtHead(7);
             ll.insertAtHead(8);

             //ll.print();
             ll.printMiddleElement();
             
        }

    }

    

