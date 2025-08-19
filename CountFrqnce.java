import java.util.Scanner;

public class CountFrqnce{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter element to find frequence: ");
        int x = scn.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println("Element is appeared "+ " " + count + " times");
        scn.close();
    }
}
