package JAVA1;
//import java.util.*;
// linkedlist has 3 methods


public class LinkedList {
    public Node head;

    public LinkedList(){
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
        public static void main(String[] args){
             LinkedList ll =new LinkedList();

             ll.insertAtHead(4);
             ll.insertAtHead(5);
             ll.insertAtHead(6);

             ll.print();
        }

        public void printMiddleElement() {
        }

    }

    

