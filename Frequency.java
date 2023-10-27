public class Frequency 
{
    public static void main(String args[]) 
	{
        int array[] = {2, 3, 2, 6, 3, 5,2};

        for (int i = 0; i < array.length; i++) 
		{
            int count = 1;
            
            if (array[i] != -1) 
			{
                for (int j = i + 1; j < array.length; j++) 
				{
                    if (array[i] == array[j]) 
					{
                        count++;
                        array[j] = -1; // element  processed
                    }
                }
                
                System.out.println(array[i] + ": " + count);
            }
        }
    }
}
