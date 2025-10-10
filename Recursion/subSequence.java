package DSA_JavaCodes.Recursion;

public class subSequence {
    public static void subSeq(String str, int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        //to include the char
        subSeq(str, idx+1, newString+currChar);

        //to exclude the char

        subSeq(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSeq(str,0,"");
    }
}
