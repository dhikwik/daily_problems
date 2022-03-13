package JAVA;

public class reverseEachWord {
    public static void main(String[] args){
        String str= "Java Programming";
        String[] words =str.split("");
        String revStr="";
        for(int i=words.length-1; i>=0;i--) {
            String word = words[i];
            String revWord="";
            for(int j=word.length()-1;j>=0;j--) {
                revWord=revWord+word.charAt(j);

        }
        revStr=revStr+revWord;


    }
    System.out.println(revStr);
    
}  
}
