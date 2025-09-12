
import java.util.Scanner;

public class Second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elemenets:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }else if(arr[i] > second && arr[i]!=first){
                second = arr[i];
            }
        }

        if(second == Integer.MIN_VALUE){
            System.out.println("SECOND LARGEST ELEMENT IS NOT FOUND:");
        }else{
            System.out.println("Second largest elements is" + second);
        }
        sc.close();
    }
}
