package Recursion;

public class factoOfn {
    public static void facto(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        facto(n-1,fact);
    }
    public static void main(String[] args) {
        int n =5;
        facto(n,1);
    }
}