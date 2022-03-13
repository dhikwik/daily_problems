package JAVA1;

public class power {
    public static void main(String[] args){
        int base=5;
        int exponent=3;
        int result=1;

        while(exponent>0){
            result=result*base;
            exponent--;

        }
        System.out.println(result);
    }
    
}
