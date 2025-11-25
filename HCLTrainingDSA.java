import java.util.*;

public class HCLTrainingDSA {
    // Example 1: Reverse an array
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for(int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Example 2: Check if number is prime
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    // Example 3: Fibonacci series
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Reversed Array: ");
        reverseArray(arr);

        int num = 17;
        System.out.println(num + " is prime? " + isPrime(num));

        System.out.print("Fibonacci Series (first 10 numbers): ");
        fibonacci(10);
    }
}
