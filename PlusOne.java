/*The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].*/
import java.util.Arrays;
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] a = new int[n];
        int marks = 0;
        int carry = 1;

        if (digits[n - 1] == 9) {
            marks = 1;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                marks = 0;
            }

            if (marks == 1) {
                a[i] = 0;
            } else {
                a[i] = digits[i] + carry;
                carry = 0;
            }
        }

        if (marks == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            for (int i = 0; i < n; i++) {
                result[i + 1] = a[i];
            }
            return result;
        }

        return a;
    }

    public static void main(String[] args) {
        // Example usage
        int[] digits = {1, 2, 3}; // Change this array to test with different digits
        int[] result = plusOne(digits);

        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
