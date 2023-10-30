import java.util.Scanner;
class PascalTriangle
 {
    public static void main(String[] args) 
	{
	System.out.print("Enter the number of lines");
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the number of rows for Pascal's Triangle: ");
	int n=scanner.nextInt();
	int spaces=n;
	int number=1;
	for(int i=0;i<n;i++)
	{
	   //nested for loop for spaces
	 for(int s=1;s<=spaces;s++)
	 {
	 System.out.print(" "); // Add spaces for formatting
      }
	  number=1;
	  for (int j = 0; j <= i; j++) {
                System.out.printf(number +" "); // Print the number with formatting
                number = number * (i - j) / (j + 1);
            }
			spaces--;
		System.out.println();
	}
	}
}		
		   
	
	