package JAVA1;

public class sumOfDigit {
    public static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return sumOfDigit(n/10)+n%10;

    }
    public static void main(String[] args){
        System.out.println(sumOfDigit(123));
    }
    
}
