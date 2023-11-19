/*Problem: Rotate an array of n elements to the right by k steps. 
For example, with n= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/

class Shift {
    public static void main(String args[]) {
        int k = 3;
        int a[] = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < k; i++) {
            int last = a[a.length - 1];

            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }

            a[0] = last;
        }

        // Printing the rotated array
        System.out.print("Rotated Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
    