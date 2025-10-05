
import java.util.Arrays;
import java.util.Scanner;

public class Shift0ToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count =0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }

        while(count < n){
            arr[count] = 0;
            count++;
        }

        System.out.println("Array after moving zeros" + Arrays.toString(arr));
        sc.close();
    }

}
