//5: floyds traingle
 /* &
   & & 
   & % &  
 */
class PatternA {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) 
		{
            for (int j = 1; j <= i; j++) 
			    {
                  if (i == 1|| j == 1 || j == i)
				   {
                    System.out.print("&");
                   }
				   else 
				   {
                    System.out.print("%");
                   }
                }
            System.out.println();
        }
    }
}
