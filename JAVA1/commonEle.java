package JAVA1;

public class commonEle {
    public static void common(int[] arr1,int[] arr2,int[] arr3){
        //0,0,1
        //0,0,2
        //1,0,2
        //2,0,2
        //2,1,2
        //2,2,2
        //2,2,3
        //3,2,3
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;

            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else if(arr2[j]>arr3[k]){
                k++;
            }
            else{
                i++;
            }
        }

    }
// simple- brute force approach

    public static void main(String[] args){
        int[] arr1={1,5,10,20,40,80};
        int[] arr2={6,7,20,80,100};
        int[] arr3={3,4,15,20,30,70,80,120};
        common(arr1,arr2,arr3);
    }
    
}
         