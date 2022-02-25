package JAVA;
import java.util.*;

public class perfectnum {
    public static void main(String[] args){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){

            for(int i=0; i<num; i++){
                if(num%i==0){
                    sum=sum+i;
                }
            }
            if(sum==num){
                System.out.println("Perfect Number");
            }
            else{
                System.out.println("Not Perfect Number");
            }
        }
        else{
            System.out.println("negative value");
        }

    }
}
//perfect num is positive interger which is equal to the sum of positive divisor(factors)