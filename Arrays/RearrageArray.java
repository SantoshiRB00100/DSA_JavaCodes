import java.util.Arrays;
import java.util.Scanner;

public class RearrageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Step 2: Take array elements from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Sort the array (if needed)
        Arrays.sort(arr); // ensures the array is sorted before rearranging

        // Step 4: Call rearrange function
        rearrangeMaxMin(arr);

        // Step 5: Display the result
        System.out.println("Rearranged Array: " + Arrays.toString(arr));

        sc.close();
    }

    public static void rearrangeMaxMin(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        int start = 0;
        int end = n - 1;
        int index = 0;

        while (start <= end) {
            if (index % 2 == 0) {
                temp[index] = arr[end--]; // place largest remaining
            } else {
                temp[index] = arr[start++]; // place smallest remaining
            }
            index++;
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    
}

