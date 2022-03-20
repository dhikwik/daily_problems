package JAVA1;



//import java.util.*;
// linkedlist has 3 methods


public class searchll {
    public Node head;

    public searchll(){
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
    public Boolean search(int value){
        Node temp=head;
        Boolean found=false;
        while(temp!=null){
            if(temp.data==value){
                found=true;
                break;
                
            }
            temp=temp.next;
        }
        return found;
    }
        public static void main(String[] args){
            searchll ll =new searchll();

             ll.insertAtHead(4);
             ll.insertAtHead(5);
             ll.insertAtHead(6);
             ll.insertAtHead(7);
             ll.insertAtHead(8);

             //ll.print();
             System.out.println(ll.search(6));
             
        }

    }

    

