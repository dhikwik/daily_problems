package JAVA1;

public class decimalToBinary {
    public static void deci(int n){
        int[] arr= new int[30];
        int cnt=0;
        while(n>0){
            arr[cnt]=n%2;
            n=n/2;
            cnt++;
        }
        for(int i=cnt-1;i>=0;i--){
            System.out.println(arr[i]);

        }

    }
    public static void main(String[] args){
        int n=77;
        deci(n);
    }
    
}
