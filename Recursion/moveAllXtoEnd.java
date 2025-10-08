package Recursion;

public class moveAllXtoEnd {
    public static void moveAllXToEnd(String str,int idx,int count,String newString){
        if(idx == str.length()){
            for(int i=0; i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllXToEnd(str, idx+1, count, newString);
        }else{
            newString += currChar;
            moveAllXToEnd(str, idx+1, count, newString);
        }
     }

    public static void main(String[] args) {
        String str = "acbxxdexx";
        moveAllXToEnd(str,0,0,"");
    }
}
