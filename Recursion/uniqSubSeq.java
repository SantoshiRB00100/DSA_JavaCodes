package DSA_JavaCodes.Recursion;
import java.util.HashSet;
public class uniqSubSeq {
    public static void uniqesubseq(String str, int idx, String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
        //to be included
        uniqesubseq(str, idx+1, newString+currChar, set);
        //not to be
        uniqesubseq(str, idx+1, newString, set);
    } 
    public static void main(String[] args) {
        String str ="aaa";
        HashSet<String> set = new HashSet<>();
        uniqesubseq(str,0,"",set);
    }
}
