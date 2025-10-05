package Recursion;

public class sumOfN {
    public static void sumNum(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        sumNum(n-1,sum);
    }
    public static void main(String[] args) {
        int n = 5;
        sumNum(n,0);
    }
}
