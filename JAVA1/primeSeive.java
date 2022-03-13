package JAVA1;

public class primeSeive {
    public static void Prime(int n){
        boolean prime[] = new boolean[n+1];

        //mark all as primeSeive
        for(int i=2;i<n;i++){
            prime[i] = true;
        }
        // mark all multiple of the num as false
        for(int p=2;p<=Math.sqrt(n);p++){
            if(prime[p]){
                for(int j=2;j*p<n;j++){
                    prime[j*p]=false;
                }
            }
        }

        for(int i=0;i<n; i++){
            if(prime[i]){
                System.out.println(i);
            }
        }


    }
    public static void main(String[] args){
        int n=20;
        Prime(n);
    }
    
}
