package JAVA1;

public class countOfDigit {
    public static int count(int n){
        if( n==0 ) {return 0;}
        return 1+count(n/10);

    }
    public static void main(String[] args) {
        int n=887;
        int r=count(n);
        System.out.println(r);
    }
    
}
