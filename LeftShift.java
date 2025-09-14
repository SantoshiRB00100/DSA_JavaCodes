import java.util.Scanner;

public class LeftShift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;

        for(int num:arr){
            System.out.print( num + " "  );
        }
         
        sc.close();
    }
}