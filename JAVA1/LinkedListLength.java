package JAVA1;
public class LinkedListLength {

    public Node head;

    public LinkedListLength(){
        this.head = null;
    }

    public Node insert(int data){
        if(head == null){
            head= new Node(data);
        }else{
            Node temp = new Node(data);
            temp.next=head;
            head =temp;
        }
    return head;
    }
    public int printLength(){
        int cnt=0;
        Node temp=head;

        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public void print(){
        Node temp=head;
        while(temp!= null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        LinkedListLength ll=new LinkedListLength();
        ll.insert(5);
        ll.insert(6);
        ll.insert(8);
        
        ll.print();
        System.out.println(ll.printLength());
    }
}
