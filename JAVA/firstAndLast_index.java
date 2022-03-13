package JAVA;

public class firstAndLast_index {
    public static void main(String[] args){
        int[] arr={4,5,6,7,4,5,5,7,7,5,3,3,4,6,7};
        int first=-1;
        int last=-1;
        int search=7;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==search && first==-1){
                first=i;

            }
            if(arr[i]==search && first!=-1){
                last=i;
            }

        }
        System.out.println("first index: " + first +"last index"+last);
    }
    
}
