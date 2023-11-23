import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of n to find the nth Fibonacci number: ");
        int n = s.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long result = fibRecursive(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        }

        s.close();
    }
    public static long fibRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibRecursive(n - 1) + fibRecursive(n - 2);
        }
    }
}
