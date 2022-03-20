package JAVA1;

public class secondSmallest {
    public static int small(int[] arr){
        //iNTEGER
        int s=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<s){
                s=arr[i];
            }
            if(arr[i]>s && arr[i]<ss){
                ss=arr[i];
        }
    }
    return ss;
}
    public static void main(String[] args){
        int[] arr={4,5,6,7,8,9};
        System.out.println(small(arr));

    }
    
}
