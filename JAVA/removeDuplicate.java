package JAVA;
// remove duplicate of sorted array

// can also use arr instead of arr
public class removeDuplicate {
    public static void main(String[] args){
        
        int[] arr={1,2,2,4,5,5,6,6,7,8,9};
        int n=arr.length-1;
        int[] temp=new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }

        }
        temp[j++]=arr[n];
        for(int k=0; k<j; k++){

        System.out.println(temp[k]);
        }

    }
    
}
