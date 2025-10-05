package Recursion;

public class fibo {
    public static void fiboNum(int a, int b, int n){
        if(n==0){
            return;
        }
        System.out.println(a);
        fiboNum(b, a+b,n-1);
    }
    public static void main(String[] args) {
        fiboNum(0,1,7);
    }
}
