package JAVA;

public class countNoofword {
    public static void countWord(String str) {
        int cntword = 1;
         for(int i=0;i<str.length();i++) {
             if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ' ){
                 cntword++;
             }
         }
         System.out.println("cntword: " + cntword);
         return;
    }
    public static void main(String[] args){
        String str="Again i feel special";
        int res=str.split(" ").length;
       // int res=str.split("\\s+ ").length;

        System.out.println(res);
        countWord(str);
    }
    
}
