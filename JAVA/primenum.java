package JAVA;
import java.util.*;
public class primenum {
    public static boolean checkPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        
        }
        return true;
}
// math.sq or n/2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>2 && checkPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("not prime");
        }
    }
}
