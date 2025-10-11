package DSA_JavaCodes.Recursion;

public class keypadCombo {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printComb(String str, int idx, String combo){
        if(idx == str.length()){
            System.out.println(combo);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0;i<mapping.length();i++){
           printComb(str, idx+1, combo + mapping.charAt(i));
        }
    }    
    public static void main(String[] args) {
        String str = "23";
        printComb(str,0,"");
    }
}
