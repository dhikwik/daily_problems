package JAVA1;

public class segregate0nd1 {
    public static void main(String[] args){
        int[] arr = {1,0,1,0,1,1,0,0,1,1,0,0};
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                arr[cnt++]=0;
            }
        }
        while(cnt<arr.length){
            arr[cnt++]=1;
        }
        for(int i=0; i<cnt; i++){
            System.out.println(arr[i]);
        }
    }
    
}
