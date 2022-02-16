package JAVA;

public class Duplicate_element {
    public static void main(String[] args){
        int arr[]={2,3,4,5,6,4,3,7,8};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate is"+arr[i]);
                }
            }
        }
    }
}
 