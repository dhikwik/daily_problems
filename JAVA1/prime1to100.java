package JAVA1;

public class prime1to100 {
    public static void main(String[] args){
        for(int i=2;i<=100;i++){
            Boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(i);
            }

        }
    }
    
}
