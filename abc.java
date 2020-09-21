import java.util.*;

public class abc{
    public static void main(String [] args) {
     Scanner cs = new Scanner(System.in);
        System.out.print("Sentence: ");        
        
        String st=cs.nextLine();
        
        String word[]=st.split(" ");
        String last=word[word.length-2];
        
        System.out.println(last);    
    }
}
