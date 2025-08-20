import java.util.Scanner;

public class IsArrayAscending {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                ascending = false;
            }
            if(arr[i]<arr[i+1]){
                descending = false;
            }
        }
        if(ascending){
            System.out.println("Array is sorted in ascending order.");
        }else if(descending){
            System.out.println("Array is sorted in descending order.");
        }else{
            System.out.println("Array is not sorted.");
        }
        scn.close();
    }
}
