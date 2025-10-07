package Recursion;

public class ReversString {
    public static void printRevers(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRevers(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "santoshi";
        printRevers(str,str.length()-1);
    }
}
