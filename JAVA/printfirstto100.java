package JAVA;

public class printfirstto100 {
    public static void printNum(int num){
        if(num<=100)
        {
            System.out.print(num+ " ");
            printNum(num+1);
        }}
 public static void main(String[] args){
        int n=1;
        printNum(n);
    }
}
