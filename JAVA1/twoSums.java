package JAVA1;

public class twoSums {
    public static int[] twosumbrute(int[] arr,int n){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]==(n-arr[i])){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("no pair");
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(twosumbrute(arr,target));
    }
    
}
