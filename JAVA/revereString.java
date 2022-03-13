package JAVA;

public class revereString {
    public static String rev(String str) {
        if(str.length()<=1 || str==null){
            return str;
// returns t
        }
        return rev(str.substring(1))+str.charAt(0);
 

    }
    public static void main(String[] args){
        String str ="Java";
        String sem=rev(str);
        System.out.println(sem);

    }
    
}
