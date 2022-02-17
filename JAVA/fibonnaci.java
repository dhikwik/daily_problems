package JAVA;
import java.util.*;

class FibonacciNumber{
    public static void main(String[] args) {
        int first=0;
        int second=1;
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(first);
        System.out.println(second);

        int next;
        for(int i=2;i<n;i++) {
            next=first+second;
            System.out.println(next);
            first=second;
            second=next;
            

        }
        
    }

}