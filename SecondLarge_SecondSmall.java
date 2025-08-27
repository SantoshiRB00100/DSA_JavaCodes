import java.util.Scanner;

public class SecondLarge_SecondSmall {
    public static void main(String[] args) {
        Scanner scn = new  Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i=0; i< n ; i++) {
            arr[i] = scn.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : arr ){
             if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest){
                secondLargest = num;
            }
            if(num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }else if(num < secondSmallest && num != smallest){
                secondSmallest = num;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest" + secondLargest);
        System.out.println("Smallest" + smallest);
        System.out.println("Second smallest" + secondSmallest);

        scn.close();
    }
}
