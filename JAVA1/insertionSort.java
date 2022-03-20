package JAVA1;

public class insertionSort {
    public static void insert(int[] arr){
        int j,temp;
        for(int i=1;i<arr.length; i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp; 

        }
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    } 
    public static void main(String[] args){
        int[] arr={6,2,8,3,9,4,6};
        insert(arr);
    }
    
}
