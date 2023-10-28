import java.util.Scanner;

class RotateArrayToRight 
{
    public static void main(String args[]) 
	{
        int[] array = new int[]{1, 2, 3, 4, 5};
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many times you want to rotate: ");
		int n=sc.nextInt();
        for (int i = 0; i < n; i++) 
		{
            int first = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = first;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
