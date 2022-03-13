package JAVA1;

public class selectionSort {
    public static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min=i;
            // find the smallest no
            for(int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }

            }
            // then swap the 1st index with the smallest
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        
        }
    }
    public static void main(String[] args){
        int[] arr={4,7,2,3,4,1,9,6};
        selection(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
