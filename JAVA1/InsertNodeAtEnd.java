package JAVA1;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next=null;
    }
}
public class InsertNodeAtEnd {

    public Node head;
    public Node InsertAtEnd(int data){
        if(head==null){
            head=new Node(data);
        }

        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next=new Node(data);
        }
        return head;
    }

    public void print(){
        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args){

        InsertNodeAtEnd ll = new InsertNodeAtEnd();
        ll.InsertAtEnd(5);
        ll.InsertAtEnd(7);

        ll.InsertAtEnd(8);
        ll.print();



    }
    
}
