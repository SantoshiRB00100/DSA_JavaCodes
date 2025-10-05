import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int even=0, odd=0;
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0){
                System.out.println("Even number is:" + arr[i] + " And it is present at index "+" " + even);
                even++;
            }else{
                System.out.println("Odd number:"+ arr[i]+ " And it is present at index "+" " + odd);
                odd++;
            }
        }
        scn.close();
    }
}
