package JAVA1;

public class sumOfArrayRes{
    public static int sumOfArrayRes(int arr[],int n){
        if(n<=0){
            return 0;
        }
        return sumOfArrayRes(arr, n-1)+arr[n-1];
    }
    public static void main(String[] args){
        int[] arr={4,5,6,7,8,9,10,11,12,13};
        System.out.println(sumOfArrayRes(arr,arr.length));
    }
}