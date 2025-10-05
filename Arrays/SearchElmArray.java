import java.util.Scanner;

public class SearchElmArray{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter element to search:");
        int x = scn.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                index = i;
                break;
            }
        }
        if(index == -1)
          System.out.println("Element not found:");
        else
          System.out.println("Element is founs at index " + index);
        scn.close();    
    }
}

