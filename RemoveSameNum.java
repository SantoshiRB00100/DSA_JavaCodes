
import java.util.Scanner;

public class RemoveSameNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int newLength = removeDuplicates(arr,n);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.println(arr[i] + " ");
        }
         sc.close();
    }
    static int removeDuplicates(int arr[], int n){
        if(n==0 || n==1) return n;
        int i=0;
        for (int j = 1; j < n; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i +1;
    }
   
}
