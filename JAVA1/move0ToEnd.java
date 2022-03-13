package JAVA1;

public class move0ToEnd {
    public static void main(String[] args){
        int[] arr={2,3,0,7,0,0,8,0,6,0,5};
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[cnt++]=arr[i];
            }
        }
        while(cnt<arr.length){
            arr[cnt++]=0;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
