package Recursion;

public class powerUsingLog {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = printPower(x, n / 2);  // ✅ Call once

        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 10;
        int output = printPower(x, n);
        System.out.println(output);
    }
}

