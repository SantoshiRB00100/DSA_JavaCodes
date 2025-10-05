import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted)
          System.out.println("Array is in sorted order.");
        else
          System.out.println("Array is not sorted.");
        scn.close();
    }
}
