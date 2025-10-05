import java.util.Scanner;

public class ReversArrayElm{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int left=0, right=n-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Revers array:");
        for(int num:arr){
            System.out.println(num +",");
        }
    }
}
