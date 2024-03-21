import java.util.HashSet;
import java.util.Scanner;

public class wordbreak {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashSet<String> dict = new HashSet<>();
        for(int i = 0; i<n;i++){
            dict.add(scn.next());
        }
        String sentence = scn.next();
        wordbreakk(sentence,"",dict);

        
    }
    public static void wordbreakk(String str,String ans,HashSet<String> dict){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<str.length();i++){
            String left = str.substring(0,i+1);
            if(dict.contains(left)){
                String right = str.substring(i+1);
                wordbreakk(right,ans+left+" ",dict);
            }
        }
        
    }
    
}
