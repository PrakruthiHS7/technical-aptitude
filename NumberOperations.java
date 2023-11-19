/*1) Get the number from user
2) Read the number from 1 to N, which is divisible by  3 or 5  
3)  P={3^2+5^2+6^2+9^2}
4)  Q={3+5+6+9}^2
5) Get the Absolute value of the P and q.*/

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the number from the user
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        // Step 3: Calculate P = {3^2 + 5^2 + 6^2 + 9^2}
        int P = (int) (Math.pow(3, 2) + Math.pow(5, 2) + Math.pow(6, 2) + Math.pow(9, 2));

        // Step 4: Calculate Q = {3 + 5 + 6 + 9}^2
        int Q = (int) Math.pow(3 + 5 + 6 + 9, 2);

        // Step 5: Get the absolute values of P and Q
        int absP = Math.abs(P);
        int absQ = Math.abs(Q);

        // Display the results
        System.out.println("Sum of numbers divisible by 3 or 5 from 1 to " + N + ": " + sum);
        System.out.println("P = {3^2 + 5^2 + 6^2 + 9^2} = " + P);
        System.out.println("Q = {3 + 5 + 6 + 9}^2 = " + Q);
        System.out.println("Absolute value of P: " + absP);
        System.out.println("Absolute value of Q: " + absQ);

        scanner.close();
    }
}
